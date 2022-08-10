package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;

import java.time.LocalDateTime;

public class Cliente implements IPrinter {

    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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
