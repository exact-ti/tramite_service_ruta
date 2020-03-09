package com.example.tramite_service_ruta.dao.interfaces;

import java.util.List;

import com.example.tramite_service_ruta.entity.DetalleRuta;

public interface IDetalleRutaDAO {
	
	List<DetalleRuta> getDetalleRutaByRutaId(Long rutaId);
	
}
