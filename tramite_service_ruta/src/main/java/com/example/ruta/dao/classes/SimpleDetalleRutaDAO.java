package com.example.ruta.dao.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ruta.dao.interfaces.IDetalleRutaDAO;
import com.example.ruta.entity.DetalleRuta;
import com.example.ruta.entity.Ruta;
import com.example.ruta.repository.IDetalleRutaRepository;

@Component
public class SimpleDetalleRutaDAO implements IDetalleRutaDAO {

	@Autowired
	private IDetalleRutaRepository detalleRutaRepository;
	
	@Override
	public List<DetalleRuta> getDetalleRutaByRutaId(Long rutaId) {

		return detalleRutaRepository.findByRuta(new Ruta(rutaId));
	}

}
