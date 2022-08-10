package br.edu.infnet.applocacaoequipamento.model.test;

import br.edu.infnet.applocacaoequipamento.model.domain.Equipamento;

public class AppEquipamento {

    public String mensagem;

    public AppEquipamento(String mensagem){
        this.mensagem = mensagem;
    }

    public void relatorio(Equipamento equipamento) {
        System.out.println(mensagem);
        equipamento.impressao();
    }
}
