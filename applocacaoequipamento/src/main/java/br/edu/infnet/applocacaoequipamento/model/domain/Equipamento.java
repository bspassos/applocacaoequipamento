package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;

import java.util.Objects;

public abstract class Equipamento implements IPrinter {

    private String nome;
    private float mensalidade;
    private int codigo;

    public abstract float calcularPontosFidelidade();

//    public float calcularPontosFidelidade() {
//        return mensalidade;//para cada real gasto irá gerar 1 ponto.
//    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipamento)) return false;
        Equipamento that = (Equipamento) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
