package com.sancor.autorizador.domain;

import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PRESTACIONES")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prestacion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "capitulo")
	private int capitulo;
	
	@Column(name = "subcapitulo")
	private int subCapitulo;
	
	 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIPO_NOMENCLADOR", referencedColumnName = "TNO_COD", insertable = false, updatable = false)
	private Nomenclador  nomencladores;


	public Long getId() {
		return id;
	}



	public void setId(Long idPrestacion) {
		this.id = idPrestacion;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getCapitulo() {
		return capitulo;
	}



	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}



	public int getSubCapitulo() {
		return subCapitulo;
	}



	public void setSubCapitulo(int subCapitulo) {
		this.subCapitulo = subCapitulo;
	}



//	public Set<Nomenclador> getNomenclador() {
//		return nomenclador;
//	}
//
//
//
//	public void setNomenclador(Set<Nomenclador> nomenclador) {
//		this.nomenclador = nomenclador;
//	}



	
}
