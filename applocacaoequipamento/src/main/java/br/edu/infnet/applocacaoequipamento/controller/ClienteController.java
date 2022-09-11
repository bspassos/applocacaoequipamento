package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", clienteService.obterLista());

        return "cliente/lista";
    }

    @GetMapping(value = "/cliente/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        clienteService.excluir(id);

        return "redirect:/cliente/lista";
    }

}
