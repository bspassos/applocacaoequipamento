package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TUsuario")
public class Usuario implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void impressao() {
        System.out.println("#usuario");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return nome + ";" + email + ";" + senha;
    }


}
