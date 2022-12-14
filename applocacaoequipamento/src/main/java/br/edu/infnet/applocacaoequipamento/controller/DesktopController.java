package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class DesktopController {

    @Autowired
    DesktopService desktopService;
    private String mensagem;
    private String tipo;

    @GetMapping(value = "/desktop")
    public String telaCadastro() {

        return "desktop/cadastro";
    }

    @PostMapping(value = "/desktop/incluir")
    public String incluir(Desktop desktop, @SessionAttribute("user") Usuario usuario) {

        desktop.setUsuario(usuario);

        desktopService.incluir(desktop);

        mensagem = "Inclusão do desktop " + desktop.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/desktop/lista";
    }

    @GetMapping(value = "/desktop/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", desktopService.obterLista(usuario));

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "desktop/lista";
    }

    @GetMapping(value = "/desktop/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        try {
            desktopService.excluir(id);

            mensagem = "Exclusão do desktop " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        } catch (Exception e) {
            mensagem = "Impossível realizar a exclusão do desktop" + id + " !!!";
            tipo = "alert-danger";
        }

        return "redirect:/desktop/lista";
    }

}
