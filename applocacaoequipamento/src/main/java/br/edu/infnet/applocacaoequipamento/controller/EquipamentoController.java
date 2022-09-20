package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.service.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;

    @GetMapping(value = "/equipamento/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", equipamentoService.obterLista());

        return "equipamento/lista";
    }
}
