package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class DesktopController {

    @Autowired
    DesktopService desktopService;

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
