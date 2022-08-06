package br.edu.infnet.model.domain;

public class Monitor extends Equipamento {

    public float tela;
    public String resolucao;
    public String portas;

    @Override
    public String toString() {
        return super.toString() + tela + ";" + resolucao + ";" + portas;
    }
}
