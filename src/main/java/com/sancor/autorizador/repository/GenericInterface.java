package com.sancor.autorizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericInterface<T> extends JpaRepository<T, T>{
	
	//Alguna busqueda particular
	
	T findByCodigo(T t);

}
