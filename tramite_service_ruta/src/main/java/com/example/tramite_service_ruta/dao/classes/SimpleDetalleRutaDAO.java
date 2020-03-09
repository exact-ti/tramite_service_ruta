package com.example.tramite_service_ruta.dao.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.tramite_service_ruta.dao.interfaces.IDetalleRutaDAO;
import com.example.tramite_service_ruta.entity.DetalleRuta;
import com.example.tramite_service_ruta.entity.Ruta;
import com.example.tramite_service_ruta.repository.IDetalleRutaRepository;

@Component
public class SimpleDetalleRutaDAO implements IDetalleRutaDAO {

	@Autowired
	private IDetalleRutaRepository detalleRutaRepository;
	
	@Override
	public List<DetalleRuta> getDetalleRutaByRutaId(Long rutaId) {

		return detalleRutaRepository.findByRuta(new Ruta(rutaId));
	}

}
