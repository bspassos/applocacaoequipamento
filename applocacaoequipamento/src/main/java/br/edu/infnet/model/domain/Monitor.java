package br.edu.infnet.model.domain;

public class Monitor extends Equipamento {

    private float tela;
    private String resolucao;
    private String portas;

    public float getTela() {
        return tela;
    }

    public void setTela(float tela) {
        this.tela = tela;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + tela + ";" + resolucao + ";" + portas;
    }
}
