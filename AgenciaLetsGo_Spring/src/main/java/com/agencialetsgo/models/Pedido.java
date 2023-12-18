package com.agencialetsgo.models;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPedido;
	private LocalDate dataInicioViagem;
	private LocalDate dataFimViagem;
	private enum formaPagamentoPedido {PIX, BOLETO, CARTAO_DE_CREDITO};
	private formaPagamentoPedido formaPagamento;
	private String viajantesPedido;

	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="cliente_fk")
	private Cliente cliente;
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="destino_fk")
	private Destino destino;

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getDataInicioViagem() {
		return dataInicioViagem;
	}

	public void setDataInicioViagem(LocalDate dataInicioViagem) {
		this.dataInicioViagem = dataInicioViagem;
	}

	public LocalDate getDataFimViagem() {
		return dataFimViagem;
	}

	public void setDataFimViagem(LocalDate dataFimViagem) {
		this.dataFimViagem = dataFimViagem;
	}

	public formaPagamentoPedido getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(formaPagamentoPedido formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getViajantesPedido() {
		return viajantesPedido;
	}

	public void setViajantesPedido(String viajantesPedido) {
		this.viajantesPedido = viajantesPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

//	public Set<Cliente> getClientes() {
//		return clientes;
//	}
//
//	public void setClientes(Set<Cliente> clientes) {
//		this.clientes = clientes;
//	}
//
//	public Set<Destino> getDestinos() {
//		return destinos;
//	}
//
//	public void setDestinos(Set<Destino> destinos) {
//		this.destinos = destinos;
//	}
//	
//	

	
}
