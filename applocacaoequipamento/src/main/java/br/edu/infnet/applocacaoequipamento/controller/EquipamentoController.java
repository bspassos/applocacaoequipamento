package br.edu.infnet.applocacaoequipamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipamentoController {

    @GetMapping(value = "/equipamento/lista")
    public String telaLista() {
        return "equipamento/lista";
    }
}
