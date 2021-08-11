package com.appVendas.apiAppVendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appVendas.apiAppVendas.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}
