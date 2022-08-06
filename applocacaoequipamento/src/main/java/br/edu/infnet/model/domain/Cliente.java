package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Cliente {

    public String nome;
    public String cpf;
    public String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + email;
    }
}
