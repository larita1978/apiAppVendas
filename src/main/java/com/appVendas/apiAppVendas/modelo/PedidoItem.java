package com.appVendas.apiAppVendas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PedidoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedidoItem;
	
	private Float quantidade;
	private Float precoOriginal;
	private Float precoVenda;
	private Float valorDesconto;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Pedido pedido;

	public Long getIdPedidoItem() {
		return idPedidoItem;
	}

	public void setIdPedidoItem(Long idPedidoItem) {
		this.idPedidoItem = idPedidoItem;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPrecoOriginal() {
		return precoOriginal;
	}

	public void setPrecoOriginal(Float precoOriginal) {
		this.precoOriginal = precoOriginal;
	}

	public Float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Float getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
