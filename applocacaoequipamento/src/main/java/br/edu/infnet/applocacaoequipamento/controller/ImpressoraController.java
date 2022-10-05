package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.ImpressoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class ImpressoraController {

    @Autowired
    ImpressoraService impressoraService;

    private String mensagem;
    private String tipo;

    @GetMapping(value = "/impressora")
    public String telaCadastro() {

        return "impressora/cadastro";
    }

    @PostMapping(value = "/impressora/incluir")
    public String incluir(Impressora impressora, @SessionAttribute("user") Usuario usuario) {

        impressora.setUsuario(usuario);

        impressoraService.incluir(impressora);

        mensagem = "Inclusão do desktop " + impressora.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/impressora/lista";
    }

    @GetMapping(value = "/impressora/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", impressoraService.obterLista(usuario));

        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);

        return "impressora/lista";
    }

    @GetMapping(value = "/impressora/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        try {
            impressoraService.excluir(id);

            mensagem = "Exclusão da impressora " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        } catch (Exception e) {
            mensagem = "Impossível realizar a exclusão da impressora" + id + " !!!";
            tipo = "alert-danger";
        }


        return "redirect:/impressora/lista";
    }
}
