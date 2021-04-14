package br.com.docket.test.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.docket.test.model.entities.Cartorio;
import br.com.docket.test.model.repositories.CartorioRepository;

@RestController
@RequestMapping("/cartorio")
public class CartorioController {

	@Autowired
	private CartorioRepository cartorioRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Cartorio novoCartorio(@Valid Cartorio cartorio) {
		cartorioRepository.save(cartorio);
		return cartorio;
	}
	
	@GetMapping
	public Iterable<Cartorio> obterCartorios(){
		return cartorioRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Cartorio> obterCartorioPorNome(@PathVariable String parteNome){
		return cartorioRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Cartorio> obterPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina){
		
		if(qtdePagina>=5) qtdePagina = 5;
		Pageable page = PageRequest.of(numeroPagina,qtdePagina);
		return cartorioRepository.findAll(page);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Cartorio> obterPorId(@PathVariable int id){
		return cartorioRepository.findById(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirCartorio(@PathVariable int id) {
		 cartorioRepository.deleteById(id);
	}
	
}
