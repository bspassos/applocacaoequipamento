package br.edu.infnet.applocacaoequipamento.model.repository;

import br.edu.infnet.applocacaoequipamento.model.domain.Equipamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EquipamentoRepository extends CrudRepository<Equipamento, Integer> {

    @Query("from Equipamento e where e.usuario.id = :idUsuario")
    Collection<Equipamento> findAll(Integer idUsuario);
}
