package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    private String mensagem;
    private String tipo;

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro() {

        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario) {

        try {
            usuarioService.incluir(usuario);
        } catch (Exception e) {
            return "redirect:/cliente";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String excluir(@PathVariable String email) {


        try {
            usuarioService.excluir(email);

            mensagem = "Exclusão do usuario " + email + " realizada com sucesso!!!";
            tipo = "alert-success";
        } catch (Exception e) {
            mensagem = "Impossível realizar a exclusão do usuario" + email + " !!!";
            tipo = "alert-danger";
        }

        return "redirect:/usuario/lista";
    }

}
