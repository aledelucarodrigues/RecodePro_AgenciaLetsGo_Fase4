package com.agencialetsgo.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Destino")
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestino;
	
	@Column(name="nome_destino", length = 150, nullable = false)
	private String nomeDestino;
	
	private String descricaoDestino;
	private String enderecoDestino;
	private String cidadeDestino;
	private int cepDestino;
	private String ufDestino;
	private String paisDestino;
	
	@JsonIgnore
	@Transient
	@OneToMany(mappedBy = "pedidos", cascade = {CascadeType.ALL})
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public Long getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Long idPedido) {
		this.idDestino = idPedido;
	}

	public String getNomeDestino() {
		return nomeDestino;
	}

	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}

	public String getDescricaoDestino() {
		return descricaoDestino;
	}

	public void setDescricaoDestino(String descricaoDestino) {
		this.descricaoDestino = descricaoDestino;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public int getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(int cepDestino) {
		this.cepDestino = cepDestino;
	}

	public String getUfDestino() {
		return ufDestino;
	}

	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
