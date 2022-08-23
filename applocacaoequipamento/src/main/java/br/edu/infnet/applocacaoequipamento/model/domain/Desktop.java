package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.model.exception.MemoriaDesktopInvalidaException;

public class Desktop extends Equipamento {

    private String processador;
    private int memoria;
    private String hd;

    @Override
    public void impressao(){
        System.out.println("#desktop");
        System.out.println(this);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public float calcularPontosFidelidade() throws MemoriaDesktopInvalidaException {

        if(memoria < 8){
            throw new MemoriaDesktopInvalidaException("Impossível preencher a memoria com valor menor que 8");
        }

        //produto do tipo Desktop usa um multiplicador de pontos de acordo com a memória
        float multiplicador = memoria < 16 ? 1.5f : 2;

        return getMensalidade() * multiplicador;
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
