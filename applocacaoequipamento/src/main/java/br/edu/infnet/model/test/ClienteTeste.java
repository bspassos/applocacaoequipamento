package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Locacao;

import java.time.LocalDateTime;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.nome = "Pedro";
        c1.cpf = "12345678900";
        c1.email = "pedro@nobarquinho.com";
        System.out.println(c1);

        Cliente c2 = new Cliente();
        c2.nome = "Thiago";
        c2.cpf = "78945612399";
        c2.email = "thiago@nobarquinho.com";
        System.out.println(c2);

        Cliente c3 = new Cliente();
        c3.nome = "Joao";
        c3.cpf = "32165498700";
        c3.email = "joao@nobarquinho.com";
        System.out.println(c3);
        
    }
}
