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
        i1.tipo = "Laser";
        i1.marca = "Epson";
        i1.tanqueDeTinta = false;
        System.out.println(i1);

        Impressora i2 = new Impressora();
        i2.tipo = "Deskjet";
        i2.marca = "HP";
        i2.tanqueDeTinta = false;
        System.out.println(i2);

        Impressora i3 = new Impressora();
        i3.tipo = "Deskjet";
        i3.marca = "HP";
        i3.tanqueDeTinta = true;
        System.out.println(i3);
    }
}
