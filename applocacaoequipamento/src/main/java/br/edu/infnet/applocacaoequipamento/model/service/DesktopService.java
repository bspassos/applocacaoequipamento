package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class DesktopService {

    private static Map<Integer, Desktop> mapaDesktop = new HashMap<Integer, Desktop>();
    private static Integer id = 1;

    public void incluir(Desktop desktop){
        desktop.setId(id++);
        mapaDesktop.put(desktop.getId(), desktop);

        AppImpressao.relatorio("Cadastro do desktop " + desktop.getNome() + " realizado com sucesso!", desktop);
    }

    public Collection<Desktop> obterLista(){
        return mapaDesktop.values();
    }

    public void excluir(Integer id){
        mapaDesktop.remove(id);
    }

}
