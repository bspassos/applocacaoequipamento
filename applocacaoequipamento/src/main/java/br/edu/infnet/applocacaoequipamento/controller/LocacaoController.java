package br.edu.infnet.applocacaoequipamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocacaoController {

    @GetMapping(value = "/locacao/lista")
    public String telaLista() {
        return "locacao/lista";
    }
}
