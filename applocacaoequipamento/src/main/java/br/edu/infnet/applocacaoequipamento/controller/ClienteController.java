package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    private String mensagem;
    private String tipo;

    @GetMapping(value = "/cliente")
    public String telaCadastro() {

        return "cliente/cadastro";
    }

    @PostMapping(value = "/cliente/incluir")
    public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {

        cliente.setUsuario(usuario);

        clienteService.incluir(cliente);

        mensagem = "Inclusão do cliente " + cliente.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/cliente/lista";
    }

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", clienteService.obterLista(usuario));

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "cliente/lista";
    }

    @GetMapping(value = "/cliente/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        try {
            clienteService.excluir(id);

            mensagem = "Exclusão do cliente " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        } catch (Exception e) {
            mensagem = "Impossível realizar a exclusão do solicitante " + id + " !!!";
            tipo = "alert-danger";
        }

        return "redirect:/cliente/lista";
    }

}
