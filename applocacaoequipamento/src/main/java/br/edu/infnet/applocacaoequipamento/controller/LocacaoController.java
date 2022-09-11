package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LocacaoController {

    @Autowired
    LocacaoService locacaoService;

    @GetMapping(value = "/locacao/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", locacaoService.obterLista());

        return "locacao/lista";
    }

    @GetMapping(value = "/locacao/{id}/excluir")
    public
String exclusao(@PathVariable Integer id) {

        locacaoService.excluir(id);

        return "redirect:/locacao/lista";
    }

}