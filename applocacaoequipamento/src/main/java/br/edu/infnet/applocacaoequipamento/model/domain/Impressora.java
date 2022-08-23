package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.model.exception.TipoImpressoraNuloException;

public class Impressora extends Equipamento {

    private String tipo;
    private String marca;
    private boolean tanqueDeTinta;

    @Override
    public void impressao(){
        System.out.println("#impressora");
        System.out.println(this);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public float calcularPontosFidelidade() throws TipoImpressoraNuloException {

        if(tipo == null){
            throw new TipoImpressoraNuloException("Impossível preencher o tipo (" + tipo + ") com valor nulo");
        }

        int pontosAdicionais = tipo == "Laser" ? 200 : 0;

        return getMensalidade() + pontosAdicionais;
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
