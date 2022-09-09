package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.app.Projeto;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private Projeto projeto;

    public void incluir(Projeto projeto) {
        this.projeto = projeto;

        AppImpressao.relatorio("exibição do Projeto" + projeto.getNome() + "realizada com sucesso!!", projeto);
    }

    public Projeto obterProjeto(){
        return projeto;
    }
}
