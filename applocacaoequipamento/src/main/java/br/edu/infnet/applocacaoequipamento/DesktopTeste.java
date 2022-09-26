package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.controller.ClienteController;
import br.edu.infnet.applocacaoequipamento.controller.DesktopController;
import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;
import br.edu.infnet.applocacaoequipamento.model.exception.MemoriaDesktopInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.service.DesktopService;
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

@Component
@Order(3)
public class DesktopTeste implements ApplicationRunner {

    @Autowired
    DesktopService desktopService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===================================================");
        System.out.println("######desktop");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        String dir = "/aula_java/";
        String arq = "produtos.txt";

        try{
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    if("D".equalsIgnoreCase(campos[0])){
                        try {
                            Desktop d1 = new Desktop();
                            d1.setCodigo(Integer.parseInt(campos[1]));
                            d1.setNome(campos[2]);
                            d1.setMensalidade(Float.parseFloat(campos[3]));
                            d1.setProcessador(campos[4]);
                            d1.setMemoria(Integer.parseInt(campos[5]));
                            d1.setHd(campos[6]);
                            System.out.println("Cálculo de pontos de fidelidade: " + d1.calcularPontosFidelidade());
                            d1.setUsuario(usuario);
                            desktopService.incluir(d1);
                        } catch (MemoriaDesktopInvalidaException e) {
                            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
                        }
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

        try {
            Desktop d4 = new Desktop();
            d4.setCodigo(3);
            d4.setNome("Desktop Dell XPS 8950");;
            d4.setMensalidade(480);;
            d4.setProcessador("Core i7 12th");;
            d4.setMemoria(4);
            d4.setHd("1TB");
            System.out.println("Cálculo de pontos de fidelidade: " + d4.calcularPontosFidelidade());
            desktopService.incluir(d4);
        } catch (MemoriaDesktopInvalidaException e) {
            System.out.println("[ERROR - DESKTOP] " + e.getMessage());
        }

        //-----------------------------------------------------------------------


        System.out.println("===================================================");

    }
}
