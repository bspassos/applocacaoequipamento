package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;

import java.time.LocalDateTime;

public class Locacao implements IPrinter {

    private String descricao;
    private LocalDateTime data;
    private int meses;
    private Cliente cliente;

    public Locacao(String cpf, String email, String nome) {
        cliente = new Cliente(cpf, email, nome);
    }

    @Override
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
        return descricao + ";" + data + ";" + meses + ";" + cliente;
    }

}
