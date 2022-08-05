package br.edu.infnet.model.domain;

public class Monitor {

    public float tela;
    public String resolucao;
    public String portas;

    @Override
    public String toString() {
        return tela + ";" + resolucao + ";" + portas;
    }
}
