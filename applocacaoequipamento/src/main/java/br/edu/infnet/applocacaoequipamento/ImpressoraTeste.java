package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.test.AppEquipamento;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Impressora i1 = new Impressora();
        i1.setCodigo(4);
        i1.setNome("Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi");
        i1.setMensalidade(30);
        i1.setTipo("Deskjet");
        i1.setMarca("HP");
        i1.setTanqueDeTinta(false);
        //i1.impressao();

        new AppEquipamento("Cadastro do desktop " + i1.getNome()).relatorio(i1);

        Impressora i2 = new Impressora();
        i2.setCodigo(5);
        i2.setNome("Impressora multifuncional deskjet tanque hp 416");
        i2.setMensalidade(60);
        i2.setTipo("Deskjet");
        i2.setMarca("HP");
        i2.setTanqueDeTinta(true);
        //i2.impressao();

        new AppEquipamento("Cadastro do desktop " + i2.getNome()).relatorio(i2);

        Impressora i3 = new Impressora();
        i3.setCodigo(6);
        i3.setNome("Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4");
        i3.setMensalidade(400);
        i3.setTipo("Laser");
        i3.setMarca("Xerox");
        i3.setTanqueDeTinta(false);
        //i3.impressao();

        new AppEquipamento("Cadastro do desktop " + i3.getNome()).relatorio(i3);
    }
}
