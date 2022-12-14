package br.edu.infnet.applocacaoequipamento;


import br.edu.infnet.applocacaoequipamento.controller.ImpressoraController;
import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.exception.TipoImpressoraNuloException;
import br.edu.infnet.applocacaoequipamento.model.service.ImpressoraService;
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
@Order(5)
public class ImpressoraTeste implements ApplicationRunner {

    @Autowired
    ImpressoraService impressoraService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######impressora");


        String dir = "/aula_java/";
        String arq = "produtos.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    if("I".equalsIgnoreCase(campos[0])){
                        try {
                            Impressora i1 = new Impressora();
                            i1.setCodigo(Integer.parseInt(campos[1]));
                            i1.setNome(campos[2]);
                            i1.setMensalidade(Float.parseFloat(campos[3]));
                            i1.setTipo(campos[4]);
                            i1.setMarca(campos[5]);
                            i1.setTanqueDeTinta(Boolean.parseBoolean(campos[6]));
                            System.out.println("C??lculo de pontos de fidelidade: " + i1.calcularPontosFidelidade());
                            impressoraService.incluir(i1);
                        } catch (TipoImpressoraNuloException e) {
                            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
                        }
                    }

                    linha = leitura.readLine();
                }

                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo n??o existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }
        }finally {
            System.out.println("Terminou!!!");
        }

        //TESTANDO EXCE????ES------------------------------------------------------

        try {
            Impressora i4 = new Impressora();
            i4.setCodigo(6);
            i4.setNome("Impressora Laser Monocrom??tica, Xerox, B210, 30 PPM, A4");
            i4.setMensalidade(400);
            i4.setTipo(null);
            i4.setMarca("Xerox");
            i4.setTanqueDeTinta(false);
            System.out.println("C??lculo de pontos de fidelidade: " + i4.calcularPontosFidelidade());
            impressoraService.incluir(i4);
        } catch (TipoImpressoraNuloException e) {
            System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
        }

        //-----------------------------------------------------------------------

        System.out.println("===================================================");

    }
}
