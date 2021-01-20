package com.sancor.autorizador.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Nomenclador")
public class Nomenclador {

	
	@Id
	@Column(name = "TNO_COD")
	private String codigo;
	
	@Column(name = "TNO_DES")
	private String descripcion;
}
