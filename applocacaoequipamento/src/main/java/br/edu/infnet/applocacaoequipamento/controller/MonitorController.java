package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MonitorController {

    @Autowired
    MonitorService monitorService;

    @GetMapping(value = "/monitor/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", monitorService.obterLista());

        return "monitor/lista";
    }

    @GetMapping(value = "/monitor/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        monitorService.excluir(id);

        return "redirect:/monitor/lista";
    }
}
