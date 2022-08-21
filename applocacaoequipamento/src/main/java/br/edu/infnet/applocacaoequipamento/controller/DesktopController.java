package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class DesktopController {

    private static Map<Integer, Desktop> mapaDesktop = new HashMap<Integer, Desktop>();
    private static Integer id = 1;

    public static void incluir(Desktop desktop){
        desktop.setId(id++);
        mapaDesktop.put(desktop.getId(), desktop);

        AppImpressao.relatorio("Cadastro do desktop " + desktop.getNome() + " realizado com sucesso!", desktop);
    }

    public static Collection<Desktop> obterLista(){
        return mapaDesktop.values();
    }

    public static void excluir(Integer id){
        mapaDesktop.remove(id);
    }

    @GetMapping(value = "/desktop/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "desktop/lista";
    }

    @GetMapping(value = "/desktop/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/desktop/lista";
    }

}
