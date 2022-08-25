package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ClienteController;
import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("===================================================");
        System.out.println("######cliente");

        try {
            Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");
            ClienteController.incluir(c1);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        try {
            Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");
            ClienteController.incluir(c2);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        try {
            Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");
            ClienteController.incluir(c3);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        try{
            Cliente c4 = new Cliente("CPF Nulo", null, "cpfnulo@foradobarquinho.com");
            ClienteController.incluir(c4);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        try{
            Cliente c5 = new Cliente("CPF vazio", "", "cpfvazio@foradobarquinho.com");
            ClienteController.incluir(c5);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        System.out.println("===================================================");

    }
}
