package br.edu.infnet.applocacaoequipamento;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class DesktopTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================================================");
        System.out.println("######desktop");

        Desktop d1 = new Desktop();
        d1.setCodigo(1);
        d1.setNome("Desktop Dell Workstation Precision 3460");;
        d1.setMensalidade(250);;
        d1.setProcessador("Core i3 12th");;
        d1.setMemoria(8);
        d1.setHd("512GB");

        AppImpressao.relatorio("Cadastro do desktop " + d1.getNome(), d1);

        Desktop d2 = new Desktop();
        d2.setCodigo(2);
        d2.setNome("Desktop Dell Workstation Precision 3660");;
        d2.setMensalidade(350);;
        d2.setProcessador("Core i5 12th");;
        d2.setMemoria(16);
        d2.setHd("1TB");

        AppImpressao.relatorio("Cadastro do desktop " + d2.getNome(), d2);

        Desktop d3 = new Desktop();
        d3.setCodigo(3);
        d3.setNome("Desktop Dell XPS 8950");;
        d3.setMensalidade(480);;
        d3.setProcessador("Core i7 12th");;
        d3.setMemoria(32);
        d3.setHd("1TB");

        AppImpressao.relatorio("Cadastro do desktop " + d3.getNome(), d3);

        System.out.println("===================================================");

    }
}
