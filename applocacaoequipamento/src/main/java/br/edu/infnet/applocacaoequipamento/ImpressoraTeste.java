package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ImpressoraController;
import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.exception.TipoImpressoraNuloException;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######impressora");

        try {
            Impressora i1 = new Impressora();
            i1.setCodigo(4);
            i1.setNome("Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi");
            i1.setMensalidade(30);
            i1.setTipo("Deskjet");
            i1.setMarca("HP");
            i1.setTanqueDeTinta(false);
            System.out.println("Cálculo de pontos de fidelidade: " + i1.calcularPontosFidelidade());
            ImpressoraController.incluir(i1);
        } catch (TipoImpressoraNuloException e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }

        try {
            Impressora i2 = new Impressora();
            i2.setCodigo(5);
            i2.setNome("Impressora multifuncional deskjet tanque hp 416");
            i2.setMensalidade(60);
            i2.setTipo("Deskjet");
            i2.setMarca("HP");
            i2.setTanqueDeTinta(true);
            System.out.println("Cálculo de pontos de fidelidade: " + i2.calcularPontosFidelidade());
            ImpressoraController.incluir(i2);
        } catch (TipoImpressoraNuloException e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }

        try {
            Impressora i3 = new Impressora();
            i3.setCodigo(6);
            i3.setNome("Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4");
            i3.setMensalidade(400);
            i3.setTipo("Laser");
            i3.setMarca("Xerox");
            i3.setTanqueDeTinta(false);
            System.out.println("Cálculo de pontos de fidelidade: " + i3.calcularPontosFidelidade());
            ImpressoraController.incluir(i3);
        } catch (TipoImpressoraNuloException e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }

        try {
            Impressora i4 = new Impressora();
            i4.setCodigo(6);
            i4.setNome("Impressora Laser Monocromática, Xerox, B210, 30 PPM, A4");
            i4.setMensalidade(400);
            i4.setTipo(null);
            i4.setMarca("Xerox");
            i4.setTanqueDeTinta(false);
            System.out.println("Cálculo de pontos de fidelidade: " + i4.calcularPontosFidelidade());
            ImpressoraController.incluir(i4);
        } catch (TipoImpressoraNuloException e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }

        System.out.println("===================================================");

    }
}
