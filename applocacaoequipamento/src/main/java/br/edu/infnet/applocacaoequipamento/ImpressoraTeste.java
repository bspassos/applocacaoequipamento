package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Impressora;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#impressora");

        Impressora i1 = new Impressora();
        i1.setCodigo(4);
        i1.setNome("Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi");
        i1.setMensalidade(30);
        i1.setTipo("Deskjet");
        i1.setMarca("HP");
        i1.setTanqueDeTinta(false);
        System.out.println(i1);

        Impressora i2 = new Impressora();
        i1.setCodigo(5);
        i1.setNome("Impressora multifuncional deskjet tanque hp 416");
        i1.setMensalidade(60);
        i1.setTipo("Deskjet");
        i1.setMarca("HP");
        i1.setTanqueDeTinta(true);
        System.out.println(i2);

        Impressora i3 = new Impressora();
        i1.setCodigo(6);
        i1.setNome("Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4");
        i1.setMensalidade(400);
        i1.setTipo("Laser");
        i1.setMarca("Xerox");
        i1.setTanqueDeTinta(false);
        System.out.println(i3);
    }
}
