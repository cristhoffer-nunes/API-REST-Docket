package br.com.docket.test.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.docket.test.model.entities.Cartorio;


public interface CartorioRepository extends PagingAndSortingRepository<Cartorio, Integer> {
	
	public Iterable<Cartorio> findByNomeContainingIgnoreCase(String parteNome);
}
