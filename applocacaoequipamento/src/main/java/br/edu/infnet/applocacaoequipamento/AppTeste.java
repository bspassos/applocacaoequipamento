package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.domain.app.Atributo;
import br.edu.infnet.applocacaoequipamento.model.domain.app.Classe;
import br.edu.infnet.applocacaoequipamento.model.domain.app.Projeto;
import br.edu.infnet.applocacaoequipamento.model.service.AppService;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Order(6)
public class AppTeste implements ApplicationRunner {

    @Autowired
    private AppService appService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######app");

        String dir = "/aula_java/";
        String arq = "app.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                Projeto projeto = null;
                List<Classe> classes = null;
                List<Atributo> atributos = null;

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()){
                        case "P":
                            classes = new ArrayList<Classe>();

                            projeto = new Projeto();
                            projeto.setNome(campos[1]);
                            projeto.setDescricao(campos[2]);
                            projeto.setClasses(classes);

                            break;
                        case "C":
                            atributos = new ArrayList<Atributo>();

                            Classe classe = new Classe();
                            classe.setNome(campos[1]);
                            classe.setAtributos(atributos);

                            classes.add(classe);

                            break;
                        case "A":
                            Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);

                            atributos.add(atributo);

                            break;
                        default:
                            System.out.println("Opção inválida!!!");
                            break;
                    }

                    linha = leitura.readLine();
                }

                //projeto.impressao();
                appService.incluir(projeto);

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

        Atributo descricao = new Atributo("descricao", "String", "Descrição da locação");
        Atributo data = new Atributo("data", "LocalDateTime", "Data de inicio da locação");
        Atributo meses = new Atributo("meses", "int", "Quantidade de meses de duração da locação");


        System.out.println("===================================================");

    }
}
