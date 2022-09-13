package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DesktopController {

    @Autowired
    DesktopService desktopService;

    @GetMapping(value = "/desktop")
    public String telaCadastro() {

        return "desktop/cadastro";
    }

    @PostMapping(value = "/desktop/incluir")
    public String incluir(Desktop desktop) {

        desktopService.incluir(desktop);

        return "redirect:/desktop/lista";
    }

    @GetMapping(value = "/desktop/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", desktopService.obterLista());

        return "desktop/lista";
    }

    @GetMapping(value = "/desktop/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        desktopService.excluir(id);

        return "redirect:/desktop/lista";
    }

}
