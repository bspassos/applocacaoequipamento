package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.LocacaoController;
import br.edu.infnet.applocacaoequipamento.model.domain.*;
import br.edu.infnet.applocacaoequipamento.model.exception.ClienteNuloException;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
import br.edu.infnet.applocacaoequipamento.model.exception.LocacaoSemEquipamentoException;
import br.edu.infnet.applocacaoequipamento.model.exception.MemoriaDesktopInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.service.LocacaoService;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
@Order(2)
public class LocacaoTeste implements ApplicationRunner {

    @Autowired
    LocacaoService locacaoService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("===================================================");
        System.out.println("######locação");

        //-----------------------------------------------------------------------------------------

        String dir = "/aula_java/";
        String arq = "locacoes.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                Set<Equipamento> equipamentos = null;
                List<Locacao> locacoes = new ArrayList<Locacao>();

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()){
                        case "L":
                            try {

                                equipamentos = new HashSet<Equipamento>();

                                Cliente cliente = new Cliente(campos[3], campos[4], campos[5]);

                                Locacao locacao = new Locacao(cliente, equipamentos);
                                locacao.setDescricao(campos[1]);
                                locacao.setMeses(Integer.parseInt(campos[2]));

                                locacoes.add(locacao);
                            } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
                                System.out.println("[ERROR - LOCACAO] " + e.getMessage());
                            }
                            break;
                        case "D":
                            Desktop desktop = new Desktop();
                            desktop.setCodigo(Integer.parseInt(campos[1]));
                            desktop.setNome(campos[2]);
                            desktop.setMensalidade(Float.parseFloat(campos[3]));
                            desktop.setProcessador(campos[4]);
                            desktop.setMemoria(Integer.parseInt(campos[5]));
                            desktop.setHd(campos[6]);
                            equipamentos.add(desktop);
                            break;
                        case "M":
                            Monitor monitor = new Monitor();
                            monitor.setCodigo(Integer.parseInt(campos[1]));
                            monitor.setNome(campos[2]);
                            monitor.setMensalidade(Float.parseFloat(campos[3]));
                            monitor.setTela(Float.parseFloat(campos[4]));
                            monitor.setResolucao(campos[5]);
                            monitor.setPortas(campos[6]);
                            equipamentos.add(monitor);
                            break;
                        case "I":
                            Impressora impressora = new Impressora();
                            impressora.setCodigo(Integer.parseInt(campos[1]));
                            impressora.setNome(campos[2]);
                            impressora.setMensalidade(Float.parseFloat(campos[3]));
                            impressora.setTipo(campos[4]);
                            impressora.setMarca(campos[5]);
                            impressora.setTanqueDeTinta(Boolean.parseBoolean(campos[6]));
                            equipamentos.add(impressora);
                            break;
                        default:
                            break;
                    }

                    linha = leitura.readLine();
                }

                for(Locacao l : locacoes){
                    locacaoService.incluir(l);

                    System.out.println(">>>>>>>>>>>>" + l.getId());
                    System.out.println(">>>>>>>>>" + l.getCliente().getNome());
                    System.out.println(">>>>>>" + l.getEquipamentos().size());
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

        /*try{
            Set<Equipamento> listaEquipamentoL4 = new HashSet<Equipamento>();
            listaEquipamentoL4.add(d1);
            listaEquipamentoL4.add(i1);
            listaEquipamentoL4.add(m1);

            Cliente c4 = new Cliente("Joao", "42165498700", "joao@nobarquinho.com");

            Locacao l4 = new Locacao(null, listaEquipamentoL4);
            l4.setDescricao("Locação 4");
            l4.setMeses(12);
            locacaoService.incluir(l4);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        try{
            Set<Equipamento> listaEquipamentoL5 = new HashSet<Equipamento>();

            Cliente c5 = new Cliente("Joao", "52165598700", "joao@nobarquinho.com");

            Locacao l5 = new Locacao(c5, listaEquipamentoL5);
            l5.setDescricao("Locação 5");
            l5.setMeses(12);
            locacaoService.incluir(l5);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }

        try{
            Set<Equipamento> listaEquipamentoL6 = null;

            Cliente c6 = new Cliente("Joao", "62166698700", "joao@nobarquinho.com");

            Locacao l6 = new Locacao(c6, listaEquipamentoL6);
            l6.setDescricao("Locação 6");
            l6.setMeses(12);
            locacaoService.incluir(l6);
        } catch (CpfInvalidoException | ClienteNuloException | LocacaoSemEquipamentoException e) {
            System.out.println("[ERROR - LOCACAO] " + e.getMessage());
        }*/

        //-----------------------------------------------------------------------

        System.out.println("===================================================");
    }
}
