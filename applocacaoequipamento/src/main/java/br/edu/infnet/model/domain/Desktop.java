package br.edu.infnet.model.domain;

public class Desktop extends Equipamento {

    private String processador;
    private int memoria;
    private String hd;

    public void impressao(){
        System.out.println("#desktop");
        System.out.println(this);
    }

    @Override
    public float calcularPontosFidelidade() {
        //produto do tipo Desktop usa um multiplicador de pontos de acordo com a memória
        float multiplicador = memoria < 16 ? 1.5f : 2;

        return super.calcularPontosFidelidade() * multiplicador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + processador + ";" + memoria + ";" + hd;
    }
}
