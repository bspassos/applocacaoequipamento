package br.edu.infnet.model.domain;

public class Impressora extends Equipamento {

    public String tipo;
    public String marca;
    public boolean tanqueDeTinta;

    @Override
    public String toString() {
        return super.toString() + tipo + ";" + marca + ";" + tanqueDeTinta;
    }
}
