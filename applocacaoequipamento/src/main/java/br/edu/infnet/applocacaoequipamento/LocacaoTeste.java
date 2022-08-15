package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
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

        System.out.println("===================================================");
        System.out.println("######locação");

        Locacao l1 = new Locacao("Pedro", "12345678900", "pedro@nobarquinho.com");
        l1.setDescricao("Locação 1");
        l1.setData(LocalDateTime.now());
        l1.setMeses(3);
        AppImpressao.relatorio("Cadastrado a locação " + l1.getDescricao(), l1);

        Locacao l2 = new Locacao("Thiago", "78945612399", "thiago@nobarquinho.com");
        l2.setDescricao("Locação 2");
        l2.setData(LocalDateTime.now());
        l2.setMeses(6);
        AppImpressao.relatorio("Cadastrado a locação " + l2.getDescricao(), l2);

        Locacao l3 = new Locacao("Joao", "32165498700", "joao@nobarquinho.com");
        l3.setDescricao("Locação 3");
        l3.setData(LocalDateTime.now());
        l3.setMeses(12);
        AppImpressao.relatorio("Cadastrado a locação " + l3.getDescricao(), l3);

        System.out.println("===================================================");
    }
}
