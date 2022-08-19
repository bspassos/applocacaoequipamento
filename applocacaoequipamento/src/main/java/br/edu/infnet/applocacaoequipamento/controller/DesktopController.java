package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DesktopController {

    private static List<Desktop> desktops = new ArrayList<Desktop>();;

    public static void incluir(Desktop desktop){
        desktops.add(desktop);
        AppImpressao.relatorio("Cadastro do desktop " + desktop.getNome() + " realizado com sucesso!", desktop);
    }

    @GetMapping(value = "/desktop/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", desktops);

        return "desktop/lista";
    }
}
