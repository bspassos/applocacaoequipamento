package br.edu.infnet.model.domain;

public class Desktop extends Equipamento {

    private String processador;
    private int memoria;
    private String hd;

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
        return super.toString() + processador + ";" + memoria + ";" + hd;
    }
}
