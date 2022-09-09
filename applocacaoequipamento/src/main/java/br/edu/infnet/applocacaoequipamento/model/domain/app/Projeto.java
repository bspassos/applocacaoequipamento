package br.edu.infnet.applocacaoequipamento.model.domain.app;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;

import java.util.List;

public class Projeto implements IPrinter {

    private String nome;
    private String descricao;
    private List<Classe> classes;

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void impressao() {
        System.out.println("- " + nome + " | " + descricao);
        for(Classe c : classes){
            c.impressao();
        }
    }
}
