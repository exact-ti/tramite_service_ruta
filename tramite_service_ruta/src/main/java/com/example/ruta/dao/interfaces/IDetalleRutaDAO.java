package com.example.ruta.dao.interfaces;

import java.util.List;

import com.example.ruta.entity.DetalleRuta;

public interface IDetalleRutaDAO {
	
	List<DetalleRuta> getDetalleRutaByRutaId(Long rutaId);
	
}
