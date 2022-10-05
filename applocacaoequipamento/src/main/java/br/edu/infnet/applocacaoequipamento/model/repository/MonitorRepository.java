package br.edu.infnet.applocacaoequipamento.model.repository;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MonitorRepository extends CrudRepository<Monitor, Integer> {

    @Query("from Monitor m where m.usuario.id = :idUsuario")
    Collection<Monitor> findAll(Integer idUsuario);
}
