package com.sancor.autorizador.repository;


import org.springframework.stereotype.Repository;

@Repository
public interface GenericInterface<T> {
	
	//Alguna busqueda particular
	
	T findByCodigo(T t);

}
