package com.sancor.autorizador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sancor.autorizador.domain.Prestacion;

@Repository
public interface PrestacionRepository extends JpaRepository<Prestacion, Long>  {
}
