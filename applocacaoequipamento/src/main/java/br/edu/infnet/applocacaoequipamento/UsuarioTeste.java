package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(6)
public class UsuarioTeste implements ApplicationRunner {

    @Autowired
    UsuarioService usuarioService;
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######usuario");

        Usuario usuario = new Usuario();
        usuario.setEmail("admin@admin.com");
        usuario.setNome("Administrador");
        usuario.setSenha("123");

        usuarioService.incluir(usuario);

        System.out.println("===================================================");

    }
}
