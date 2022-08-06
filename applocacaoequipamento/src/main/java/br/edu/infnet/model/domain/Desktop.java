package br.edu.infnet.model.domain;

public class Desktop extends Equipamento {

    public String processador;
    public int memoria;
    public String hd;

    @Override
    public String toString() {
        return super.toString() + processador + ";" + memoria + ";" + hd;
    }
}
