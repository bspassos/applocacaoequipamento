package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.LocacaoController;
import br.edu.infnet.applocacaoequipamento.model.domain.*;
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
    public void run(ApplicationArguments args) throws Exception {

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

        Cliente c1 = new Cliente("Pedro", "12345678900", "pedro@nobarquinho.com");

        Set<Equipamento> listaEquipamentoL1 = new HashSet<Equipamento>();

        listaEquipamentoL1.add(d1);
        listaEquipamentoL1.add(d2);
        listaEquipamentoL1.add(i1);

        Locacao l1 = new Locacao(c1);
        l1.setDescricao("Locação 1");
        l1.setMeses(3);
        l1.setEquipamentos(listaEquipamentoL1);
        LocacaoController.incluir(l1);
        //AppImpressao.relatorio("Cadastrado a locação " + l1.getDescricao(), l1);

        Cliente c2 = new Cliente("Thiago", "78945612399", "thiago@nobarquinho.com");

        Set<Equipamento> listaEquipamentoL2 = new HashSet<Equipamento>();

        listaEquipamentoL2.add(m1);

        Locacao l2 = new Locacao(c2);
        l2.setDescricao("Locação 2");
        l2.setMeses(6);
        l2.setEquipamentos(listaEquipamentoL2);
        LocacaoController.incluir(l2);
        //AppImpressao.relatorio("Cadastrado a locação " + l2.getDescricao(), l2);

        Cliente c3 = new Cliente("Joao", "32165498700", "joao@nobarquinho.com");

        Set<Equipamento> listaEquipamentoL3 = new HashSet<Equipamento>();

        listaEquipamentoL3.add(d1);
        listaEquipamentoL3.add(i1);
        listaEquipamentoL3.add(m1);

        Locacao l3 = new Locacao(c3);
        l3.setDescricao("Locação 3");
        l3.setMeses(12);
        l3.setEquipamentos(listaEquipamentoL3);
        LocacaoController.incluir(l3);
        //AppImpressao.relatorio("Cadastrado a locação " + l3.getDescricao(), l3);

        System.out.println("===================================================");
    }
}
