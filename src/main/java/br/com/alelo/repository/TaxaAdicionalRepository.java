package br.com.alelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TaxaAdicionalRepository extends CrudRepository<TaxaAdicionalEntity,Long> {

    TaxaAdicionalEntity findByProduto(@Param("produto") String produto);

}
