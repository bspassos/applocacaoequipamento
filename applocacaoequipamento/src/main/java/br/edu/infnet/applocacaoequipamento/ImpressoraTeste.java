package br.edu.infnet.applocacaoequipamento;


import br.edu.infnet.applocacaoequipamento.controller.ImpressoraController;
import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.exception.TipoImpressoraNuloException;
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

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######impressora");


        String dir = "/aula_java/";
        String arq = "impressoras.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    try {
                        String[] campos = linha.split(";");
                        Impressora i1 = new Impressora();
                        i1.setCodigo(Integer.parseInt(campos[0]));
                        i1.setNome(campos[1]);
                        i1.setMensalidade(Float.parseFloat(campos[2]));
                        i1.setTipo(campos[3]);
                        i1.setMarca(campos[4]);
                        i1.setTanqueDeTinta(Boolean.parseBoolean(campos[5]));
                        System.out.println("Cálculo de pontos de fidelidade: " + i1.calcularPontosFidelidade());
                        ImpressoraController.incluir(i1);
                    } catch (TipoImpressoraNuloException e) {
                        System.out.println("[ERROR - IMPRESSORA] " + e.getMessage());
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
