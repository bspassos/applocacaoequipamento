package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Locacao;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.repository.LocacaoRepository;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public void incluir(Locacao locacao){
        locacaoRepository.save(locacao);

        AppImpressao.relatorio("Cadastro da locacao " + locacao.getDescricao() + " realizado com sucesso!", locacao);
    }

    public Collection<Locacao> obterLista(){
        return (Collection<Locacao>) locacaoRepository.findAll();
    }
    public Collection<Locacao> obterLista(Usuario usuario){
        return (Collection<Locacao>) locacaoRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        locacaoRepository.deleteById(id);
    }

}
