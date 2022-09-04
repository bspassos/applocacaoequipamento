package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsuarioController {

    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();

    public static Usuario validar(String email, String senha){

        Usuario usuario = mapaUsuario.get(email);

        if(usuario != null && usuario.getSenha().equals(senha)){
            return usuario;
        }

        return null;
    }

    public static void incluir(Usuario usuario){

        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio("Cadastro do usuario " + usuario.getNome() + " realizado com sucesso!", usuario);
    }

    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro(Model model) {

        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String inclusao(Usuario usuario) {

        incluir(usuario);

        return "redirect:/";
    }


}
