package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DesktopController {

    private static List<Desktop> desktops;

    @GetMapping(value = "/desktop/lista")
    public String telaLista(Model model) {


        Desktop d1 = new Desktop();
        d1.setCodigo(1);
        d1.setNome("Desktop Dell Workstation Precision 3460");;
        d1.setMensalidade(250);;
        d1.setProcessador("Core i3 12th");;
        d1.setMemoria(8);
        d1.setHd("512GB");

        Desktop d2 = new Desktop();
        d2.setCodigo(2);
        d2.setNome("Desktop Dell Workstation Precision 3660");;
        d2.setMensalidade(350);;
        d2.setProcessador("Core i5 12th");;
        d2.setMemoria(16);
        d2.setHd("1TB");

        Desktop d3 = new Desktop();
        d3.setCodigo(3);
        d3.setNome("Desktop Dell XPS 8950");;
        d3.setMensalidade(480);;
        d3.setProcessador("Core i7 12th");;
        d3.setMemoria(32);
        d3.setHd("1TB");

        desktops = new ArrayList<Desktop>();
        desktops.add(d1);
        desktops.add(d2);
        desktops.add(d3);

        model.addAttribute("listagem", desktops);

        return "desktop/lista";
    }
}
