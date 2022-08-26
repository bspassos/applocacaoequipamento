package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;
import br.edu.infnet.applocacaoequipamento.model.exception.ClienteNuloException;
import br.edu.infnet.applocacaoequipamento.model.exception.LocacaoSemEquipamentoException;

import java.time.LocalDateTime;
import java.util.Set;

public class Locacao implements IPrinter {

    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private int meses;
    private Cliente cliente;
    private Set<Equipamento> equipamentos;

    public Locacao(Cliente cliente, Set<Equipamento> equipamentos) throws ClienteNuloException, LocacaoSemEquipamentoException {

        if(cliente == null){
            throw new ClienteNuloException("Impossível criar uma Locação sem um cliente!");
        }

        if(equipamentos == null){
            throw new LocacaoSemEquipamentoException("Impossível criar uma locação sem uma listagem de equipamentos associada!");
        }

        if(equipamentos.size() < 1){
            throw new LocacaoSemEquipamentoException("Impossível criar uma locação com menos de um equipamento!");
        }

        this.data = LocalDateTime.now();
        this.cliente = cliente;
        this.equipamentos = equipamentos;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void impressao() {
        System.out.println("#locacao");
        System.out.println(this);
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Set<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
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

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return descricao + ";" + data + ";" + meses + ";" + cliente + ";" + equipamentos.size();
    }

}
