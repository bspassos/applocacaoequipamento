package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MonitorController {

    @Autowired
    MonitorService monitorService;

    private String mensagem;
    private String tipo;

    @GetMapping(value = "/monitor")
    public String telaCadastro() {

        return "monitor/cadastro";
    }

    @PostMapping(value = "/monitor/incluir")
    public String incluir(Monitor monitor) {

        monitorService.incluir(monitor);

        return "redirect:/monitor/lista";
    }

    @GetMapping(value = "/monitor/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", monitorService.obterLista());

        return "monitor/lista";
    }

    @GetMapping(value = "/monitor/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        try {
            monitorService.excluir(id);

            mensagem = "Exclusão do monitor " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        } catch (Exception e) {
            mensagem = "Impossível realizar a exclusão do monitor" + id + " !!!";
            tipo = "alert-danger";
        }


        return "redirect:/monitor/lista";
    }
}
