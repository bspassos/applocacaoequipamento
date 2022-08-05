package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Cliente {

    public String nome;
    public String cpf;
    public String email;

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + email;
    }
}
