package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Usuario;
import br.edu.infnet.applocacaoequipamento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();

    public Usuario validar(String email, String senha){

        Usuario usuario = mapaUsuario.get(email);

        if(usuario != null && usuario.getSenha().equals(senha)){
            return usuario;
        }

        return null;
    }

    public void incluir(Usuario usuario){

        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio("Cadastro do usuario " + usuario.getNome() + " realizado com sucesso!", usuario);
    }

    public Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }

    public void excluir(String email){
        mapaUsuario.remove(email);
    }

}
