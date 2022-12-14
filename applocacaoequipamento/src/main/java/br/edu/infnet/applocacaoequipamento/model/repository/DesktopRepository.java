package br.edu.infnet.applocacaoequipamento.model.repository;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DesktopRepository extends CrudRepository<Desktop, Integer> {

    @Query("from Desktop d where d.usuario.id = :idUsuario")
    Collection<Desktop> findAll(Integer idUsuario);
}
