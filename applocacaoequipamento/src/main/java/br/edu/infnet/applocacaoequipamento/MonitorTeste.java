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
        m1.tela = 18.5f;
        m1.resolucao = "1366x768";
        m1.portas = "DisplayPort e VGA";
        System.out.println(m1);

        Monitor m2 = new Monitor();
        m2.tela = 21.5f;
        m2.resolucao = "1920x1080";
        m2.portas = "HDMI e VGA";
        System.out.println(m2);

        Monitor m3 = new Monitor();
        m3.tela = 23;
        m3.resolucao = "1920x1080";
        m3.portas = "DisplayPort, VGA e HDMI";
        System.out.println(m3);
    }
}
