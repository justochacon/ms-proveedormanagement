package com.pe.gamarra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pe.gamarra.model.RegistrarProveedorRequest;
import com.pe.gamarra.model.RegistrarProveedorResponse;

@RestController
@RequestMapping("/proveedormanagement/v1")
public class ProveedorManagementController {
	
	//--HU004	Consultar tiendas
	
	@GetMapping("/consultartienda")
    @ResponseStatus(HttpStatus.OK)
    public List<Object> consultarTienda() {
		RegistrarProveedorRequest response = new RegistrarProveedorRequest();
		List<Object> list = new ArrayList<>();
		response.setId("PV001");
		response.setRazonSocial("Galeria Azul");
		response.setDescripcion("tienda de ropa en general");
		response.setRuc("10123456781");
		response.setDelivery("si");
		List<String> tipoPago = new ArrayList<>();
		tipoPago.add("efectivo");
		tipoPago.add("yape");
		response.setTipoPago(tipoPago);
		RegistrarProveedorRequest response2 = new RegistrarProveedorRequest();
		list.add(response);
		return list;
		
	}
	
	//--HU006	Registro de Proveedor
	
	@PostMapping("/registrarProveedor")
    @ResponseStatus(HttpStatus.OK)
    public Object registrarProveedor(@RequestBody RegistrarProveedorRequest request) {
		
		RegistrarProveedorResponse response = new RegistrarProveedorResponse();
		response.setCodRespuesta("00");
		response.setMsjRespuesta("registro correcto");
		response.setDescripcion("se enviara un correo con la confirmacion");
		response.setId(request.getId());
		
		return response;
		
	}
}
