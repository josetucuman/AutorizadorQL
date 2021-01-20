package com.sancor.autorizador.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sancor.autorizador.domain.Prestacion;
import com.sancor.autorizador.repository.PrestacionRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class PrestacionResolver implements GraphQLQueryResolver {

	@Autowired
	private PrestacionRepository prestacionRepository;
	
//	@Autowired
//	private NomencladorRepository nomencladorRepository;
	
	public Prestacion traerPrestacion(Long id) {
		return prestacionRepository.findById(id).orElse(null);
	}
	
	public List<Prestacion> traerPrestaciones(){
		return prestacionRepository.findAll();
	}
	
//	public List<Nomenclador> traerNomencladores(){
//		return nomencladorRepository.findAll();
//	}
	
	public Long contarPrestaciones() {
		return prestacionRepository.count();
	}
}
