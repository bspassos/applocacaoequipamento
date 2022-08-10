package br.edu.infnet.applocacaoequipamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MonitorController {

    @GetMapping(value = "/monitor/lista")
    public String telaLista() {
        return "monitor/lista";
    }
}
