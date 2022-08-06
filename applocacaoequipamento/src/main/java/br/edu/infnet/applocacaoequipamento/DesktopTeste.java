package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Desktop;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DesktopTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#desktop");

        Desktop d1 = new Desktop();
        d1.codigo = 1;
        d1.nome = "Desktop Dell Workstation Precision 3460";
        d1.mensalidade = 250;
        d1.processador = "Core i3 12th";
        d1.memoria = 8;
        d1.hd = "512GB";
        System.out.println(d1);

        Desktop d2 = new Desktop();
        d2.codigo = 2;
        d2.nome = "Desktop Dell Workstation Precision 3660";
        d2.mensalidade = 350;
        d2.processador = "Core i5 12th";
        d2.memoria = 16;
        d2.hd = "1TB";
        System.out.println(d2);

        Desktop d3 = new Desktop();
        d3.codigo = 3;
        d3.nome = "Desktop Dell XPS 8950";
        d3.mensalidade = 480;
        d3.processador = "Core i7 12th";
        d3.memoria = 32;
        d3.hd = "1TB";
        System.out.println(d3);
    }
}
