package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.LocacaoController;
import br.edu.infnet.applocacaoequipamento.model.domain.*;
import br.edu.infnet.applocacaoequipamento.model.exception.ClienteNuloException;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
import br.edu.infnet.applocacaoequipamento.model.exception.LocacaoSemEquipamentoException;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Component
@Order(2)
public class LocacaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("===================================================");
        System.out.println("######locação");

        Desktop d1 = new Desktop();
        d1.setCodigo(1);
        d1.setNome("Desktop Dell Workstation Precision 3460");;
        d1.setMensalidade(250);;
        d1.setProcessador("Core i3 12th");;
        d1.setMemoria(8);
        d1.setHd("512GB");

        Desktop d2 = new Desktop();
        d2.setCodigo(1);
        d2.setNome("Desktop Dell Workstation Precision 3460");;
        d2.setMensalidade(250);;
        d2.setProcessador("Core i3 12th");
        d2.setMemoria(8);
        d2.setHd("512GB");

        Impressora i1 = new Impressora();
        i1.setCodigo(4);
        i1.setNome("Impressora multifuncional hp DeskJet Ink Advantage 2774 com Wi-Fi");
        i1.setMensalidade(30);
        i1.setTipo("Deskjet");
        i1.setMarca("HP");
        i1.setTanqueDeTinta(false);

        Monitor m1 = new Monitor();
        m1.setCodigo(7);
        m1.setNome("Monitor Dell 18.5\" E1920H");
        m1.setMensalidade(100);
        m1.setTela(18.5f);
        m1.setResolucao("1366x768");
        m1.setPortas("DisplayPort e VGA");

        //-----------------------------------------------------------------------------------------


        try {
            Set<Equipamento> listaEquipamentoL1 = new HashSet<Equipamento>();
            listaEquipamentoL1.add(d1);
            listaEquipamentoL1.add(d2);
            listaEquipamentoL1.add(i1);

            Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");

            Locacao l1 = new Locacao(c1, listaEquipamentoL1);
            l1.setDescricao("Locação 1");
            l1.setMeses(3);
            LocacaoController.incluir(l1);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------


        try{
            Set<Equipamento> listaEquipamentoL2 = new HashSet<Equipamento>();
            listaEquipamentoL2.add(m1);

            Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");

            Locacao l2 = new Locacao(c2, listaEquipamentoL2);
            l2.setDescricao("Locação 2");
            l2.setMeses(6);
            LocacaoController.incluir(l2);
            //AppImpressao.relatorio("Cadastrado a locação " + l2.getDescricao(), l2);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------

        try{
            Set<Equipamento> listaEquipamentoL3 = new HashSet<Equipamento>();
            listaEquipamentoL3.add(d1);
            listaEquipamentoL3.add(i1);
            listaEquipamentoL3.add(m1);

            Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");

            Locacao l3 = new Locacao(c3, listaEquipamentoL3);
            l3.setDescricao("Locação 3");
            l3.setMeses(12);
            LocacaoController.incluir(l3);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------

        try{
            Set<Equipamento> listaEquipamentoL4 = new HashSet<Equipamento>();
            listaEquipamentoL4.add(d1);
            listaEquipamentoL4.add(i1);
            listaEquipamentoL4.add(m1);

            Cliente c4 = new Cliente("Joao", "42165498700", "joao@nobarquinho.com");

            Locacao l4 = new Locacao(null, listaEquipamentoL4);
            l4.setDescricao("Locação 4");
            l4.setMeses(12);
            LocacaoController.incluir(l4);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------

        try{
            Set<Equipamento> listaEquipamentoL5 = new HashSet<Equipamento>();

            Cliente c5 = new Cliente("Joao", "52165598700", "joao@nobarquinho.com");

            Locacao l5 = new Locacao(c5, listaEquipamentoL5);
            l5.setDescricao("Locação 5");
            l5.setMeses(12);
            LocacaoController.incluir(l5);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------


        try{
            Set<Equipamento> listaEquipamentoL6 = null;

            Cliente c6 = new Cliente("Joao", "62166698700", "joao@nobarquinho.com");

            Locacao l6 = new Locacao(c6, listaEquipamentoL6);
            l6.setDescricao("Locação 6");
            l6.setMeses(12);
            LocacaoController.incluir(l6);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------

        System.out.println("===================================================");
    }
}
