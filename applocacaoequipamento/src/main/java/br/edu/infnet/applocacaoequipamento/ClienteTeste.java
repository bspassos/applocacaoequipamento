package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("===================================================");
        System.out.println("######locação");

        Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");
        AppImpressao.relatorio("Cadastrado o cliente " + c1.getNome(), c1);

        Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");
        AppImpressao.relatorio("Cadastrado o cliente " + c2.getNome(), c2);

        Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");
        AppImpressao.relatorio("Cadastrado o cliente " + c3.getNome(), c3);

        System.out.println("===================================================");

    }
}
