package com.example.ruta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ruta.dao.interfaces.IDetalleRutaDAO;
import com.example.ruta.entity.DetalleRuta;
import com.example.ruta.service.DetalleRutaService;

@Controller
@RequestMapping("/rutas")
public class RutaController {
	
	@Autowired
	IDetalleRutaDAO detalleRutaDAO;
	
	DetalleRutaService detalleRutaService;
	
	@GetMapping("{id}/detalleruta")
	@Secured({"ADMIN", "LISTAR_DETALLE_RUTA"})
	ResponseEntity<List<DetalleRuta>> listarDetalleRutaByRutaId(@PathVariable("id") Long rutaId){
		return new ResponseEntity<List<DetalleRuta>>(new DetalleRutaService(detalleRutaDAO).getDetalleRutaByRutaId(rutaId), HttpStatus.OK);
	}
}
