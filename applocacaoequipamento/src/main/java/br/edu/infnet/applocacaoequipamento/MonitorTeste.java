package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class MonitorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================================================");
        System.out.println("######monitor");

        Monitor m1 = new Monitor();
        m1.setCodigo(7);
        m1.setNome("Monitor Dell 18.5\" E1920H");
        m1.setMensalidade(100);
        m1.setTela(18.5f);
        m1.setResolucao("1366x768");
        m1.setPortas("DisplayPort e VGA");

        AppImpressao.relatorio("Cadastro do monitor " + m1.getNome(), m1);

        Monitor m2 = new Monitor();
        m2.setCodigo(8);
        m2.setNome("Monitor Dell de 21.5\" SE2222H");
        m2.setMensalidade(180);
        m2.setTela(21.5f);
        m2.setResolucao("1920x1080");
        m2.setPortas("HDMI e VGA");

        AppImpressao.relatorio("Cadastro do monitor " + m2.getNome(), m2);

        Monitor m3 = new Monitor();
        m3.setCodigo(9);
        m3.setNome("Monitor 23\" Dell P2319H");
        m3.setMensalidade(250);
        m3.setTela(23);
        m3.setResolucao("1920x1080");
        m3.setPortas("DisplayPort, VGA e HDMI");

        AppImpressao.relatorio("Cadastro do monitor " + m3.getNome(), m3);

        System.out.println("===================================================");
    }
}
