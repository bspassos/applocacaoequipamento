package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Locacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#cliente");

        Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");
        System.out.println(c1);

        Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");
        System.out.println(c2);

        Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");
        System.out.println(c3);
    }
}
