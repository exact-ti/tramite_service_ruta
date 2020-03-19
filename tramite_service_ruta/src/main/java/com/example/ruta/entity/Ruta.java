package com.example.ruta.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@Table(name="ruta")
@NoArgsConstructor
@RequiredArgsConstructor
public class Ruta implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ruta_id")
	@NonNull
	private Long id;
	
	private String nombre;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
