package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ImpressoraController;
import br.edu.infnet.applocacaoequipamento.controller.MonitorController;
import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.exception.TelaMonitorInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class MonitorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######monitor");

        try {
            Monitor m1 = new Monitor();
            m1.setCodigo(7);
            m1.setNome("Monitor Dell 18.5\" E1920H");
            m1.setMensalidade(100);
            m1.setTela(18.5f);
            m1.setResolucao("1366x768");
            m1.setPortas("DisplayPort e VGA");
            System.out.println("Cálculo de pontos de fidelidade: " + m1.calcularPontosFidelidade());
            MonitorController.incluir(m1);
        } catch (TelaMonitorInvalidaException e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        try{
            Monitor m2 = new Monitor();
            m2.setCodigo(8);
            m2.setNome("Monitor Dell de 21.5\" SE2222H");
            m2.setMensalidade(180);
            m2.setTela(21.5f);
            m2.setResolucao("1920x1080");
            m2.setPortas("HDMI e VGA");
            System.out.println("Cálculo de pontos de fidelidade: " + m2.calcularPontosFidelidade());
            MonitorController.incluir(m2);
        } catch (TelaMonitorInvalidaException e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        try{
            Monitor m3 = new Monitor();
            m3.setCodigo(9);
            m3.setNome("Monitor 23\" Dell P2319H");
            m3.setMensalidade(250);
            m3.setTela(23);
            m3.setResolucao("1920x1080");
            m3.setPortas("DisplayPort, VGA e HDMI");
            System.out.println("Cálculo de pontos de fidelidade: " + m3.calcularPontosFidelidade());
            MonitorController.incluir(m3);
        } catch (TelaMonitorInvalidaException e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }

        try{
            Monitor m4 = new Monitor();
            m4.setCodigo(9);
            m4.setNome("Monitor 23\" Dell P2319H");
            m4.setMensalidade(250);
            m4.setTela(12);
            m4.setResolucao("1920x1080");
            m4.setPortas("DisplayPort, VGA e HDMI");
            System.out.println("Cálculo de pontos de fidelidade: " + m4.calcularPontosFidelidade());
            MonitorController.incluir(m4);
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
            MonitorController.incluir(m5);
        } catch (TelaMonitorInvalidaException e) {
            System.out.println("[ERROR - MONITOR] " + e.getMessage());
        }


        System.out.println("===================================================");
    }
}
