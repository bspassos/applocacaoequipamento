package br.edu.infnet.model.domain;

public class Equipamento {

    public String nome;
    public float mensalidade;
    public int codigo;

    @Override
    public String toString() {
        return nome + ";" + mensalidade + ";" + codigo;
    }
}
