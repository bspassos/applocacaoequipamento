package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.repository.DesktopRepository;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DesktopService {

    @Autowired
    private DesktopRepository desktopRepository;

    public void incluir(Desktop desktop){

        desktopRepository.save(desktop);

        AppImpressao.relatorio("Cadastro do desktop " + desktop.getNome() + " realizado com sucesso!", desktop);
    }

    public Collection<Desktop> obterLista(){
        return (Collection<Desktop>) desktopRepository.findAll();
    }

    public Collection<Desktop> obterLista(Usuario usuario){
        return desktopRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        desktopRepository.deleteById(id);
    }

}
