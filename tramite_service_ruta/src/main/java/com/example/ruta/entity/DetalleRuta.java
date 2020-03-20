package com.example.ruta.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="detalle_ruta")
public class DetalleRuta implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="detalle_ruta_id")
	private Long id;
	
	@Column(name="codigo_ubicacion")
	private String codigoUbicacion;
	
	private byte orden;
	
	@ManyToOne
	@JoinColumn(name="ruta_id")
	@JsonIgnore
	private Ruta ruta;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
