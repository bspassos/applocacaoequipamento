package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LocacaoController {

    private static Map<Integer, Locacao> mapaLocacao = new HashMap<Integer, Locacao>();
    private static Integer id = 1;

    public static void incluir(Locacao locacao){
        locacao.setId(id++);
        mapaLocacao.put(locacao.getId(), locacao);

        AppImpressao.relatorio("Cadastro da locacao " + locacao.getDescricao() + " realizado com sucesso!", locacao);
    }

    public static Collection<Locacao> obterLista(){
        return mapaLocacao.values();
    }

    public static void excluir(Integer id){
        mapaLocacao.remove(id);
    }

    @GetMapping(value = "/locacao/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "locacao/lista";
    }

    @GetMapping(value = "/locacao/{id}/excluir")
    public
String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/locacao/lista";
    }

}