package br.edu.infnet.model.domain;

public class Impressora extends Equipamento {

    private String tipo;
    private String marca;
    private boolean tanqueDeTinta;

    public void impressao(){
        System.out.println("#impressora");
        System.out.println(this);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTanqueDeTinta() {
        return tanqueDeTinta;
    }

    public void setTanqueDeTinta(boolean tanqueDeTinta) {
        this.tanqueDeTinta = tanqueDeTinta;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + tipo + ";" + marca + ";" + tanqueDeTinta;
    }
}
