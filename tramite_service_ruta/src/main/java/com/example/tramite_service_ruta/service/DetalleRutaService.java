package com.example.tramite_service_ruta.service;

import java.util.List;

import com.example.tramite_service_ruta.dao.interfaces.IDetalleRutaDAO;
import com.example.tramite_service_ruta.entity.DetalleRuta;

public class DetalleRutaService {
	
	IDetalleRutaDAO detalleRutaDAO;
	
	public DetalleRutaService(IDetalleRutaDAO detalleRutaDAO) {
		this.detalleRutaDAO = detalleRutaDAO;
	}
	
	public List<DetalleRuta> getDetalleRutaByRutaId(Long rutaId){
		return detalleRutaDAO.getDetalleRutaByRutaId(rutaId);
	}
	
}
