package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");
        c1.impressao();

        Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");
        c2.impressao();

        Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");
        c3.impressao();
    }
}
