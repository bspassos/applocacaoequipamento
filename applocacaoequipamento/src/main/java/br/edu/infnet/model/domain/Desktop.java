package br.edu.infnet.model.domain;

public class Desktop {

    public String processador;
    public int memoria;
    public String hd;

    @Override
    public String toString() {
        return processador + ";" + memoria + ";" + hd;
    }
}
