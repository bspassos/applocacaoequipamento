package br.edu.infnet.model.domain;

public class Impressora {

    public String tipo;
    public String marca;
    public boolean tanqueDeTinta;

    @Override
    public String toString() {
        return tipo + ";" + marca + ";" + tanqueDeTinta;
    }
}
