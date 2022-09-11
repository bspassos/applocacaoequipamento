package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LocacaoService {

    private static Map<Integer, Locacao> mapaLocacao = new HashMap<Integer, Locacao>();
    private static Integer id = 1;

    public void incluir(Locacao locacao){
        locacao.setId(id++);
        mapaLocacao.put(locacao.getId(), locacao);

        AppImpressao.relatorio("Cadastro da locacao " + locacao.getDescricao() + " realizado com sucesso!", locacao);
    }

    public Collection<Locacao> obterLista(){
        return mapaLocacao.values();
    }

    public void excluir(Integer id){
        mapaLocacao.remove(id);
    }

}
