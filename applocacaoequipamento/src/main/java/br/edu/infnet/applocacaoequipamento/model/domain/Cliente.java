package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;
import br.edu.infnet.applocacaoequipamento.model.exception.CpfInvalidoException;

import java.time.LocalDateTime;

public class Cliente implements IPrinter {

    private Integer id;
    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome, String cpf, String email) throws CpfInvalidoException {

        if(cpf == null){
            throw new CpfInvalidoException("Não é possível aceitar CPF nulo!");
        }

        if(cpf.isEmpty()){
            throw new CpfInvalidoException("Não é possível aceitar CPF sem preenchimento!");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void impressao() {
        System.out.println("#cliente");
        System.out.println(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + email;
    }


}
