package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.repository.MonitorRepository;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    public void incluir(Monitor monitor){

        monitorRepository.save(monitor);

        AppImpressao.relatorio("Cadastro do monitor " + monitor.getNome() + " realizado com sucesso!", monitor);
    }

    public Collection<Monitor> obterLista(){
        return (Collection<Monitor>) monitorRepository.findAll();
    }

    public Collection<Monitor> obterLista(Usuario usuario){
        return monitorRepository.findAll(usuario.getId());
    }
    public void excluir(Integer id){
        monitorRepository.deleteById(id);
    }


}
