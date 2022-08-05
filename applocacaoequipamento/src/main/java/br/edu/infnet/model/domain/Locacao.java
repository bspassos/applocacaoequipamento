package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Locacao {

    public String descricao;
    public LocalDateTime data;
    public int meses;

    @Override
    public String toString() {
        return descricao + ";" + data + ";" + meses;
    }
}
