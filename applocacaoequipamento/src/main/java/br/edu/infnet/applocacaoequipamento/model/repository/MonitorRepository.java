package br.edu.infnet.applocacaoequipamento.model.repository;

import br.edu.infnet.applocacaoequipamento.model.domain.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends CrudRepository<Monitor, Integer> {

}
