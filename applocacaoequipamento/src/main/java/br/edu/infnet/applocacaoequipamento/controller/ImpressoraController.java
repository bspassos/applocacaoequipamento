package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.service.ImpressoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ImpressoraController {

    @Autowired
    ImpressoraService impressoraService;

    @GetMapping(value = "/impressora")
    public String telaCadastro() {

        return "impressora/cadastro";
    }

    @PostMapping(value = "/impressora/incluir")
    public String incluir(Impressora impressora) {

        impressoraService.incluir(impressora);

        return "redirect:/impressora/lista";
    }

    @GetMapping(value = "/impressora/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", impressoraService.obterLista());

        return "impressora/lista";
    }

    @GetMapping(value = "/impressora/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        impressoraService.excluir(id);

        return "redirect:/impressora/lista";
    }
}
