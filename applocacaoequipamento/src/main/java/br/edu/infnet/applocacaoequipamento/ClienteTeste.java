package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ClienteController;
import br.edu.infnet.applocacaoequipamento.controller.LocacaoController;
import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Equipamento;
import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.exception.ClienteNuloException;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
import br.edu.infnet.applocacaoequipamento.model.exception.LocacaoSemEquipamentoException;
import br.edu.infnet.applocacaoequipamento.model.service.ClienteService;
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
import java.util.HashSet;
import java.util.Set;

@Component
@Order(1)
public class ClienteTeste implements ApplicationRunner {

    @Autowired
    ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("===================================================");
        System.out.println("######cliente");

        String dir = "/aula_java/";
        String arq = "clientes.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    try {
                        String[] campos = linha.split(";");
                        Cliente c1 = new Cliente(campos[0], campos[1], campos[2]);
                        clienteService.incluir(c1);
                    } catch (CpfInvalidoException e) {
                        System.out.println("[ERROR - CLIENTE] " + e.getMessage());
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
            Cliente c4 = new Cliente("CPF Nulo", null, "cpfnulo@foradobarquinho.com");
            clienteService.incluir(c4);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }

        try{
            Cliente c5 = new Cliente("CPF vazio", "", "cpfvazio@foradobarquinho.com");
            clienteService.incluir(c5);
        } catch (CpfInvalidoException e) {
            System.out.println("[ERROR - CLIENTE] " + e.getMessage());
        }
        //-----------------------------------------------------------------------

        System.out.println("===================================================");

    }
}
