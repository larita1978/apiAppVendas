package com.appVendas.apiAppVendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appVendas.apiAppVendas.modelo.Pedido;
import com.appVendas.apiAppVendas.repository.PedidoRepository;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidorepository;
	
	@GetMapping
	public List<Pedido> listar(){
		
		List<Pedido> pedidos = pedidorepository.findAll();
		
		return pedidos;
	}
}
