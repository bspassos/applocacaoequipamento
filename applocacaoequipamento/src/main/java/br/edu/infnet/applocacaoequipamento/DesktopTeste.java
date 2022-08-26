package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ClienteController;
import br.edu.infnet.applocacaoequipamento.controller.DesktopController;
import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
import br.edu.infnet.applocacaoequipamento.model.exception.MemoriaDesktopInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(3)
public class DesktopTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######desktop");

        String dir = "/aula_java/";
        String arq = "desktops.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    try {
                        String[] campos = linha.split(";");
                        Desktop d1 = new Desktop();
                        d1.setCodigo(Integer.parseInt(campos[0]));
                        d1.setNome(campos[1]);
                        d1.setMensalidade(Float.parseFloat(campos[2]));
                        d1.setProcessador(campos[3]);
                        d1.setMemoria(Integer.parseInt(campos[4]));
                        d1.setHd(campos[5]);
                        System.out.println("Cálculo de pontos de fidelidade: " + d1.calcularPontosFidelidade());
                        DesktopController.incluir(d1);
                    } catch (MemoriaDesktopInvalidaException e) {
                        System.out.println("[ERROR - DESKTOP] " + e.getMessage());
                    }

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
