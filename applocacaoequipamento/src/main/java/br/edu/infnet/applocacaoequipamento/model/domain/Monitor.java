package br.edu.infnet.applocacaoequipamento.model.domain;


import br.edu.infnet.applocacaoequipamento.model.exception.TelaMonitorInvalidaException;

public class Monitor extends Equipamento {

    private float tela;
    private String resolucao;
    private String portas;

    @Override
    public void impressao(){
        System.out.println("#monitor");
        System.out.println(this);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public float calcularPontosFidelidade() throws TelaMonitorInvalidaException {

        if(tela < 14){
            throw new TelaMonitorInvalidaException("Impossível preencher a tela (" + tela + ") com valor menor que 14");
        }

        if(tela > 32){
            throw new TelaMonitorInvalidaException("Impossível preencher a tela (" + tela + ") com valor maior que 32");
        }

        //Produto do tipo monitor só oferece duas pontuações.
        return tela > 20 ? 200 : 100;
    }

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
        return super.toString() + ";" + tela + ";" + resolucao + ";" + portas;
    }
}
