package br.edu.infnet.applocacaoequipamento.model.test;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;
import br.edu.infnet.applocacaoequipamento.model.domain.Equipamento;

public class AppImpressao {

    public  static void relatorio(String mensagem, IPrinter printer) {
        System.out.println(mensagem);
        printer.impressao();
    }
}
