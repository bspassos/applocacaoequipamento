package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.service.ClienteService;
import br.edu.infnet.applocacaoequipamento.model.service.EquipamentoService;
import br.edu.infnet.applocacaoequipamento.model.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LocacaoController {

    @Autowired
    LocacaoService locacaoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private EquipamentoService equipamentoService;

    @GetMapping(value = "/locacao")
    public String telaCadastro(Model model) {

        model.addAttribute("clientes", clienteService.obterLista());
        model.addAttribute("equipamentos", equipamentoService.obterLista());

        return "locacao/cadastro";
    }

    @GetMapping(value = "/locacao/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", locacaoService.obterLista());

        return "locacao/lista";
    }

    @PostMapping(value = "/locacao/incluir")
    public String incluir(Locacao locacao){

        return "redirect:/locacao/lista";
    }

    @GetMapping(value = "/locacao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        locacaoService.excluir(id);

        return "redirect:/locacao/lista";
    }

}