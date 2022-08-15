package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class LocacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("===================================================");
        System.out.println("######locação");

        Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");

        Locacao l1 = new Locacao(c1);
        l1.setDescricao("Locação 1");
        l1.setMeses(3);
        AppImpressao.relatorio("Cadastrado a locação " + l1.getDescricao(), l1);

        Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");

        Locacao l2 = new Locacao(c2);
        l2.setDescricao("Locação 2");
        l2.setMeses(6);
        AppImpressao.relatorio("Cadastrado a locação " + l2.getDescricao(), l2);

        Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");

        Locacao l3 = new Locacao(c3);
        l3.setDescricao("Locação 3");
        l3.setMeses(12);
        AppImpressao.relatorio("Cadastrado a locação " + l3.getDescricao(), l3);

        System.out.println("===================================================");
    }
}
