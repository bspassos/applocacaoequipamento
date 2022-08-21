package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ImpressoraController {
    private static Map<Integer, Impressora> mapaImpressora = new HashMap<Integer, Impressora>();
    private static Integer id = 1;

    public static void incluir(Impressora impressora){
        impressora.setId(id++);
        mapaImpressora.put(impressora.getId(), impressora);

        AppImpressao.relatorio("Cadastro do impressora " + impressora.getNome() + " realizado com sucesso!", impressora);
    }

    public static Collection<Impressora> obterLista(){
        return mapaImpressora.values();
    }

    public static void excluir(Integer id){
        mapaImpressora.remove(id);
    }

    @GetMapping(value = "/impressora/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "impressora/lista";
    }

    @GetMapping(value = "/impressora/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/impressora/lista";
    }
}
