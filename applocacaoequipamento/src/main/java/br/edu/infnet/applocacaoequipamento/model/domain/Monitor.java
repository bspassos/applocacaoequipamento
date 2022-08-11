package br.edu.infnet.applocacaoequipamento.model.domain;

public class Monitor extends Equipamento {

    private float tela;
    private String resolucao;
    private String portas;

    @Override
    public void impressao(){
        System.out.println("#monitor");
        System.out.println(this);
        System.out.println("===============================================================");
    }

    @Override
    public float calcularPontosFidelidade() {
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
