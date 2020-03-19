package com.example.ruta.service;

import java.util.List;

import com.example.ruta.dao.interfaces.IDetalleRutaDAO;
import com.example.ruta.entity.DetalleRuta;

public class DetalleRutaService {
	
	IDetalleRutaDAO detalleRutaDAO;
	
	public DetalleRutaService(IDetalleRutaDAO detalleRutaDAO) {
		this.detalleRutaDAO = detalleRutaDAO;
	}
	
	public List<DetalleRuta> getDetalleRutaByRutaId(Long rutaId){
		return detalleRutaDAO.getDetalleRutaByRutaId(rutaId);
	}
	
}
