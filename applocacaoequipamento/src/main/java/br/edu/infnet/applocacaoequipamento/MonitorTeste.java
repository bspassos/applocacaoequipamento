package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.model.domain.Cliente;
import br.edu.infnet.model.domain.Monitor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MonitorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#monitor");

        Monitor m1 = new Monitor();
        m1.codigo = 1;
        m1.nome = "Monitor Dell 18.5\" E1920H";
        m1.mensalidade = 100;
        m1.tela = 18.5f;
        m1.resolucao = "1366x768";
        m1.portas = "DisplayPort e VGA";
        System.out.println(m1);

        Monitor m2 = new Monitor();
        m2.codigo = 2;
        m2.nome = "Monitor Dell de 21.5\" SE2222H";
        m2.mensalidade = 180;
        m2.tela = 21.5f;
        m2.resolucao = "1920x1080";
        m2.portas = "HDMI e VGA";
        System.out.println(m2);

        Monitor m3 = new Monitor();
        m3.codigo = 3;
        m3.nome = "Monitor 23\" Dell P2319H";
        m3.mensalidade = 250;
        m3.tela = 23;
        m3.resolucao = "1920x1080";
        m3.portas = "DisplayPort, VGA e HDMI";
        System.out.println(m3);
    }
}
