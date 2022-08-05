package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Locacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LocacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#locacao");

        Locacao l1 = new Locacao();
        l1.descricao = "Locação 1";
        l1.data = LocalDateTime.now();
        l1.meses = 3;
        System.out.println(l1);

        Locacao l2 = new Locacao();
        l2.descricao = "Locação 2";
        l2.data = LocalDateTime.now();
        l2.meses = 6;
        System.out.println(l2);

        Locacao l3 = new Locacao();
        l3.descricao = "Locação 3";
        l3.data = LocalDateTime.now();
        l3.meses = 12;
        System.out.println(l3);
    }
}
