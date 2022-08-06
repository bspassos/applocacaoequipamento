package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Impressora;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ImpressoraTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#impressora");

        Impressora i1 = new Impressora();
        i1.codigo = 1;
        i1.nome = "Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi";
        i1.mensalidade = 30;
        i1.tipo = "Deskjet";
        i1.marca = "HP";
        i1.tanqueDeTinta = false;
        System.out.println(i1);

        Impressora i2 = new Impressora();
        i2.codigo = 1;
        i2.nome = "Impressora multifuncional deskjet tanque hp 416";
        i2.mensalidade = 60;
        i2.tipo = "Deskjet";
        i2.marca = "HP";
        i2.tanqueDeTinta = true;
        System.out.println(i2);

        Impressora i3 = new Impressora();
        i3.codigo = 1;
        i3.nome = "Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4";
        i3.mensalidade = 400;
        i3.tipo = "Laser";
        i3.marca = "Xerox";
        i3.tanqueDeTinta = false;
        System.out.println(i3);
    }
}
