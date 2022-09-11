package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ImpressoraService {

    private static Map<Integer, Impressora> mapaImpressora = new HashMap<Integer, Impressora>();
    private static Integer id = 1;

    public void incluir(Impressora impressora){
        impressora.setId(id++);
        mapaImpressora.put(impressora.getId(), impressora);

        AppImpressao.relatorio("Cadastro do impressora " + impressora.getNome() + " realizado com sucesso!", impressora);
    }

    public Collection<Impressora> obterLista(){
        return mapaImpressora.values();
    }

    public void excluir(Integer id){
        mapaImpressora.remove(id);
    }

}
