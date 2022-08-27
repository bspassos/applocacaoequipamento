package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.MonitorController;
import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.exception.TelaMonitorInvalidaException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(4)
public class MonitorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######monitor");

        String dir = "/aula_java/";
        String arq = "monitores.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    try {
                        String[] campos = linha.split(";");
                        Monitor m1 = new Monitor();
                        m1.setCodigo(Integer.parseInt(campos[0]));
                        m1.setNome(campos[1]);
                        m1.setMensalidade(Float.parseFloat(campos[2]));
                        m1.setTela(Float.parseFloat(campos[3]));
                        m1.setResolucao(campos[4]);
                        m1.setPortas(campos[5]);
                        System.out.println("Cálculo de pontos de fidelidade: " + m1.calcularPontosFidelidade());
                        MonitorController.incluir(m1);
                    } catch (TelaMonitorInvalidaException e) {
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
