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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        d2.setCodigo(2);
        d2.setNome("Desktop Dell Workstation Precision 3660");;
        d2.setMensalidade(350);;
        d2.setProcessador("Core i5 12th");;
        d2.setMemoria(16);
        d2.setHd("1TB");

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

        String dir = "/aula_java/";
        String arq = "locacoes.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    try {

                        String[] campos = linha.split(";");

                        Set<Equipamento> listaEquipamentoL1 = new HashSet<Equipamento>();
                        listaEquipamentoL1.add(d1);
                        listaEquipamentoL1.add(d2);
                        listaEquipamentoL1.add(i1);
                        listaEquipamentoL1.add(m1);

                        Cliente c1 = new Cliente(campos[2], campos[3], campos[4]);

                        Locacao l1 = new Locacao(c1, listaEquipamentoL1);
                        l1.setDescricao(campos[0]);
                        l1.setMeses(Integer.parseInt(campos[1]));
                        LocacaoController.incluir(l1);
                    } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
                        System.out.println("[ERROR - LOCACAO] " + e.getMessage());
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

        //-----------------------------------------------------------------------------------------

        //TESTANDO EXCEÇÕES------------------------------------------------------

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

        //-----------------------------------------------------------------------

        System.out.println("===================================================");
    }
}
