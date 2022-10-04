package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;
    private String mensagem;
    private String tipo;

    @GetMapping(value = "/equipamento/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", equipamentoService.obterLista(usuario));

        return "equipamento/lista";
    }

    @GetMapping(value = "/equipamento/{id}/excluir")
    public String excluir(@PathVariable Integer id) {

        try {
            equipamentoService.excluir(id);

            mensagem = "Exclusão do desktop " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        } catch (Exception e) {
            mensagem = "Impossível realizar a exclusão do desktop" + id + " !!!";
            tipo = "alert-danger";
        }


        return "redirect:/equipamento/lista";
    }
}
