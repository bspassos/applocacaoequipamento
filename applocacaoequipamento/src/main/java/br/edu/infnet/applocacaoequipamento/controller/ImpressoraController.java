package br.edu.infnet.applocacaoequipamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImpressoraController {

    @GetMapping(value = "/impressora/lista")
    public String telaLista() {
        return "impressora/lista";
    }
}
