package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ClienteController;
import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
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

    private Usuario usuario;
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######usuario");

        Usuario usuario = new Usuario();
        usuario.setEmail("admin@admin.com");
        usuario.setNome("Administrador");
        usuario.setSenha("123");

        usuarioService.incluir(usuario);

        String dir = "/aula_java/";
        String arq = "usuarios.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    System.out.println(campos[0]);

                    usuario = new Usuario();
                    usuario.setEmail(campos[0]);
                    usuario.setNome(campos[1]);
                    usuario.setSenha(campos[2]);

                    usuarioService.incluir(usuario);

                    linha = leitura.readLine();
                }

                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }
        }finally {
            System.out.println("Terminou!!!");
        }


        System.out.println("===================================================");

    }
}
