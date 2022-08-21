package br.edu.infnet.applocacaoequipamento.controller;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MonitorController {
    private static Map<Integer, Monitor> mapaMonitor = new HashMap<Integer, Monitor>();
    private static Integer id = 1;

    public static void incluir(Monitor monitor){
        monitor.setId(id++);
        mapaMonitor.put(monitor.getId(), monitor);

        AppImpressao.relatorio("Cadastro do monitor " + monitor.getNome() + " realizado com sucesso!", monitor);
    }

    public static Collection<Monitor> obterLista(){
        return mapaMonitor.values();
    }

    public static void excluir(Integer id){
        mapaMonitor.remove(id);
    }

    @GetMapping(value = "/monitor/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "monitor/lista";
    }

    @GetMapping(value = "/monitor/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {

        excluir(id);

        return "redirect:/monitor/lista";
    }
}
