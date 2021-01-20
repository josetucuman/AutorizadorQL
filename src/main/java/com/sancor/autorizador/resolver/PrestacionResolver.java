package com.sancor.autorizador.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sancor.autorizador.domain.Nomenclador;
import com.sancor.autorizador.domain.Prestacion;
import com.sancor.autorizador.repository.NomencladorRepository;
import com.sancor.autorizador.repository.PrestacionRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class PrestacionResolver implements GraphQLQueryResolver {

	@Autowired
	private PrestacionRepository prestacionRepository;
	
	@Autowired
	private NomencladorRepository nomencladorRepository;
	
	public Prestacion traerPrestacion(Long id) {
		return prestacionRepository.findById(id).orElse(null);
		//return Prestacion.builder().capitulo(0).codigo("codigo").descripcion("descripcion").subCapitulo(0).id(id).build();
	}
	
	public List<Prestacion> traerPrestaciones(){
		return prestacionRepository.findAll();
	}
	
	public List<Nomenclador> traerNomencladores(){
		return nomencladorRepository.findAll();
	}
	
	public Long contarPrestaciones() {
		return prestacionRepository.count();
	}
}
