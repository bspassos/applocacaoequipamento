package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.repository.ClienteRepository;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void incluir(Cliente cliente){

        clienteRepository.save(cliente);

        AppImpressao.relatorio("Cadastro do cliente " + cliente.getNome() + " realizado com sucesso!", cliente);
    }

    public Collection<Cliente> obterLista(){
        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Collection<Cliente> obterLista(Usuario usuario){
        return (Collection<Cliente>) clienteRepository.obterLista(usuario.getId());
    }

    public void excluir(Integer id){
        clienteRepository.deleteById(id);
    }

}
