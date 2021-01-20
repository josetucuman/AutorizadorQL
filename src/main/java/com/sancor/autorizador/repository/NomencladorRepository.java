package com.sancor.autorizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sancor.autorizador.domain.Nomenclador;

public interface NomencladorRepository extends JpaRepository<Nomenclador, String> {

}
