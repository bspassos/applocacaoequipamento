package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Cliente;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {

    private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();
    private static Integer id = 1;

    public void incluir(Cliente cliente){
        cliente.setId(id++);
        mapaCliente.put(cliente.getId(), cliente);

        AppImpressao.relatorio("Cadastro do cliente " + cliente.getNome() + " realizado com sucesso!", cliente);
    }

    public Collection<Cliente> obterLista(){
        return mapaCliente.values();
    }

    public void excluir(Integer id){
        mapaCliente.remove(id);
    }

}
