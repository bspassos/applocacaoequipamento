package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MonitorService {
    private static Map<Integer, Monitor> mapaMonitor = new HashMap<Integer, Monitor>();
    private static Integer id = 1;

    public void incluir(Monitor monitor){
        monitor.setId(id++);
        mapaMonitor.put(monitor.getId(), monitor);

        AppImpressao.relatorio("Cadastro do monitor " + monitor.getNome() + " realizado com sucesso!", monitor);
    }

    public Collection<Monitor> obterLista(){
        return mapaMonitor.values();
    }

    public void excluir(Integer id){
        mapaMonitor.remove(id);
    }


}
