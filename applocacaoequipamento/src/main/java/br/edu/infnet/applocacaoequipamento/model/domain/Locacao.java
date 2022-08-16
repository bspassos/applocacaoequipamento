package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;

import java.time.LocalDateTime;
import java.util.List;

public class Locacao implements IPrinter {

    private String descricao;
    private LocalDateTime data;
    private int meses;
    private Cliente cliente;
    private List<Equipamento> equipamentos;

    public Locacao(Cliente cliente) {
        this.data = LocalDateTime.now();
        this.cliente = cliente;
    }

    @Override
    public void impressao() {
        System.out.println("#locacao");
        System.out.println(this);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getMeses() {
        return meses;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return descricao + ";" + data + ";" + meses + ";" + cliente + ";" + equipamentos.size();
    }

}
