package br.edu.infnet.model.domain;

public class Equipamento {

    private String nome;
    private float mensalidade;
    private int codigo;

    public float calcularPontosFidelidade() {
        return mensalidade;//para cada real gasto irá gerar 1 ponto.
    }

    @Override
    public String toString() {
        return nome + ";" + mensalidade + ";" + codigo + ";" + calcularPontosFidelidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
