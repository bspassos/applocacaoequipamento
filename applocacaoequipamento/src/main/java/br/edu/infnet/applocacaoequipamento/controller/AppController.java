package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/")
    public String telaHome() {
        return "home";
    }

    @GetMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha){

        Usuario usuario = usuarioService.validar(email, senha);

        if(usuario != null){

            model.addAttribute("user", usuario.getNome());

            return "home";
        }

        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout(Model model){
        model.addAttribute("user", "");

        return "redirect:/";
    }
}
