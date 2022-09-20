package br.edu.infnet.applocacaoequipamento.model.repository;

import br.edu.infnet.applocacaoequipamento.model.domain.Desktop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends CrudRepository<Desktop, Integer> {

}
