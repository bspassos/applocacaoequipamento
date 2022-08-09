package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Locacao {

    private String descricao;
    private LocalDateTime data;
    private int meses;

    public void impressao() {
        System.out.println("#locacao");
        System.out.println(this);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return descricao + ";" + data + ";" + meses;
    }
}
