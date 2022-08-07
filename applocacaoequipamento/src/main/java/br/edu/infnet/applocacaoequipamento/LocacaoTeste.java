package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Locacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Order(2)
public class LocacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#locacao");

        Locacao l1 = new Locacao();
        l1.setDescricao("Locação 1");
        l1.setData(LocalDateTime.now());
        l1.setMeses(3);
        System.out.println(l1);

        Locacao l2 = new Locacao();
        l2.setDescricao("Locação 2");
        l2.setData(LocalDateTime.now());
        l2.setMeses(6);
        System.out.println(l2);

        Locacao l3 = new Locacao();
        l3.setDescricao("Locação 3");
        l3.setData(LocalDateTime.now());
        l3.setMeses(12);
        System.out.println(l3);
    }
}
