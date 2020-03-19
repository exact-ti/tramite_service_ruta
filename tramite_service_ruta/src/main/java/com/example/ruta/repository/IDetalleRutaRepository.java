package com.example.ruta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ruta.entity.DetalleRuta;
import com.example.ruta.entity.Ruta;

@Repository
public interface IDetalleRutaRepository extends CrudRepository<DetalleRuta, Long> {
	
	List<DetalleRuta> findByRuta(Ruta ruta);
	
}
