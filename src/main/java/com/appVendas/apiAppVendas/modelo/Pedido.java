package com.appVendas.apiAppVendas.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	private Long idPedido;
	private String cliente;
	private String endereco;
	private Float totalItens;
	private Float totalProdutos;
	private Float valorTotal;
	
	private LocalDate dataPedido;
	
	@ManyToOne
	private Usuario usuario;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Float getTotalItens() {
		return totalItens;
	}

	public void setTotalItens(Float totalItens) {
		this.totalItens = totalItens;
	}

	public Float getTotalProdutos() {
		return totalProdutos;
	}

	public void setTotalProdutos(Float totalProdutos) {
		this.totalProdutos = totalProdutos;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
