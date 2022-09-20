package br.edu.infnet.applocacaoequipamento.model.repository;

import br.edu.infnet.applocacaoequipamento.model.domain.Impressora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpressoraRepository extends CrudRepository<Impressora, Integer> {

}
