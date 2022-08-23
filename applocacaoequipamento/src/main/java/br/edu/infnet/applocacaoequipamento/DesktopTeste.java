package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.DesktopController;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.exception.MemoriaDesktopInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class DesktopTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######desktop");

        try {
            Desktop d1 = new Desktop();
            d1.setCodigo(1);
            d1.setNome("Desktop Dell Workstation Precision 3460");;
            d1.setMensalidade(250);;
            d1.setProcessador("Core i3 12th");;
            d1.setMemoria(8);
            d1.setHd("512GB");
            System.out.println("Cálculo de pontos de fidelidade: " + d1.calcularPontosFidelidade());
            DesktopController.incluir(d1);
        } catch (MemoriaDesktopInvalidaException e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        try {
            Desktop d2 = new Desktop();
            d2.setCodigo(2);
            d2.setNome("Desktop Dell Workstation Precision 3660");;
            d2.setMensalidade(350);;
            d2.setProcessador("Core i5 12th");;
            d2.setMemoria(16);
            d2.setHd("1TB");
            System.out.println("Cálculo de pontos de fidelidade: " + d2.calcularPontosFidelidade());
            DesktopController.incluir(d2);

        } catch (MemoriaDesktopInvalidaException e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        try {
            Desktop d3 = new Desktop();
            d3.setCodigo(3);
            d3.setNome("Desktop Dell XPS 8950");;
            d3.setMensalidade(480);;
            d3.setProcessador("Core i7 12th");;
            d3.setMemoria(32);
            d3.setHd("1TB");
            System.out.println("Cálculo de pontos de fidelidade: " + d3.calcularPontosFidelidade());
            DesktopController.incluir(d3);
        } catch (MemoriaDesktopInvalidaException e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        try {
            Desktop d4 = new Desktop();
            d4.setCodigo(3);
            d4.setNome("Desktop Dell XPS 8950");;
            d4.setMensalidade(480);;
            d4.setProcessador("Core i7 12th");;
            d4.setMemoria(4);
            d4.setHd("1TB");
            System.out.println("Cálculo de pontos de fidelidade: " + d4.calcularPontosFidelidade());
            DesktopController.incluir(d4);
        } catch (MemoriaDesktopInvalidaException e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        System.out.println("===================================================");

    }
}
