package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.MonitorController;
import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.exception.TelaMonitorInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.service.MonitorService;
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
@Order(4)
public class MonitorTeste implements ApplicationRunner {

    @Autowired
    MonitorService monitorService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######monitor");

        String dir = "/aula_java/";
        String arq = "produtos.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    if("M".equalsIgnoreCase(campos[0])){
                        try {
                            Monitor m1 = new Monitor();
                            m1.setCodigo(Integer.parseInt(campos[1]));
                            m1.setNome(campos[2]);
                            m1.setMensalidade(Float.parseFloat(campos[3]));
                            m1.setTela(Float.parseFloat(campos[4]));
                            m1.setResolucao(campos[5]);
                            m1.setPortas(campos[6]);
                            System.out.println("Cálculo de pontos de fidelidade: " + m1.calcularPontosFidelidade());
                            monitorService.incluir(m1);
                        } catch (TelaMonitorInvalidaException e) {
                            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
                        }
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

        //TESTANDO EXCEÇÕES------------------------------------------------------

        try{
            Monitor m4 = new Monitor();
            m4.setCodigo(9);
            m4.setNome("Monitor 23\" Dell P2319H");
            m4.setMensalidade(250);
            m4.setTela(12);
            m4.setResolucao("1920x1080");
            m4.setPortas("DisplayPort, VGA e HDMI");
            System.out.println("Cálculo de pontos de fidelidade: " + m4.calcularPontosFidelidade());
            monitorService.incluir(m4);
        } catch (TelaMonitorInvalidaException e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        try{
            Monitor m5 = new Monitor();
            m5.setCodigo(9);
            m5.setNome("Monitor 23\" Dell P2319H");
            m5.setMensalidade(250);
            m5.setTela(42);
            m5.setResolucao("1920x1080");
            m5.setPortas("DisplayPort, VGA e HDMI");
            System.out.println("Cálculo de pontos de fidelidade: " + m5.calcularPontosFidelidade());
            monitorService.incluir(m5);
        } catch (TelaMonitorInvalidaException e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        //-----------------------------------------------------------------------

        System.out.println("===================================================");
    }
}
