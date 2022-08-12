package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================================================");
        System.out.println("######impressora");

        Impressora i1 = new Impressora();
        i1.setCodigo(4);
        i1.setNome("Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi");
        i1.setMensalidade(30);
        i1.setTipo("Deskjet");
        i1.setMarca("HP");
        i1.setTanqueDeTinta(false);

        AppImpressao.relatorio("Cadastro da impressora " + i1.getNome(), i1);

        Impressora i2 = new Impressora();
        i2.setCodigo(5);
        i2.setNome("Impressora multifuncional deskjet tanque hp 416");
        i2.setMensalidade(60);
        i2.setTipo("Deskjet");
        i2.setMarca("HP");
        i2.setTanqueDeTinta(true);

        AppImpressao.relatorio("Cadastro da impressora " + i2.getNome(), i2);

        Impressora i3 = new Impressora();
        i3.setCodigo(6);
        i3.setNome("Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4");
        i3.setMensalidade(400);
        i3.setTipo("Laser");
        i3.setMarca("Xerox");
        i3.setTanqueDeTinta(false);

        AppImpressao.relatorio("Cadastro da impressora " + i3.getNome(), i3);

        System.out.println("===================================================");

    }
}
