package br.edu.infnet.applocacaoequipamento.model.domain;

import br.edu.infnet.applocacaoequipamento.interfaces.IPrinter;
import br.edu.infnet.applocacaoequipamento.model.exception.MemoriaDesktopInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.exception.TelaMonitorInvalidaException;
import br.edu.infnet.applocacaoequipamento.model.exception.TipoImpressoraNuloException;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TEquipamento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Equipamento implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private float mensalidade;
    private int codigo;
    @ManyToMany(mappedBy = "equipamentos")
    private List<Locacao> locacoes;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public abstract float calcularPontosFidelidade() throws MemoriaDesktopInvalidaException, TipoImpressoraNuloException, TelaMonitorInvalidaException;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//    public float calcularPontosFidelidade() {
//        return mensalidade;//para cada real gasto irá gerar 1 ponto.
//    }

    @Override
    public String toString() {
        return nome + ";" + mensalidade + ";" + codigo;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
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
