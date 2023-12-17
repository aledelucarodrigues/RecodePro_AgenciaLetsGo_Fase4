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
@Table(name="Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(name="nome_cliente", length = 50, nullable = false)
	private String nomeCliente;
		
	private String cpfCliente;
	private String telefoneCliente;
	private String emailCliente;
	private String senhaCliente;
	private String enderecoCliente;
	private String cidadeCliente;
	
	@Column(name="cep_cliente", length = 9)
	private int cepCliente;
	
	@Column(name="uf_cliente", length = 2)
	private String ufCliente;
	
	@Column(name="cartao_cliente", length = 16)
	private String cartaoCreditoCliente;
	
	@Column(name="venc_cartao_cliente", length = 5)
	private String vencCartaoCreditoCliente;
	private String nomeTitularCartaoCredito;
	private String cpfTitularCartaoCredito;
	
	@JsonIgnore
	@Transient
	@OneToMany(mappedBy = "pedidos", cascade = {CascadeType.ALL})
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public int getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(int cepCliente) {
		this.cepCliente = cepCliente;
	}

	public String getUfCliente() {
		return ufCliente;
	}

	public void setUfCliente(String ufCliente) {
		this.ufCliente = ufCliente;
	}

	public String getCartaoCreditoCliente() {
		return cartaoCreditoCliente;
	}

	public void setCartaoCreditoCliente(String cartaoCreditoCliente) {
		this.cartaoCreditoCliente = cartaoCreditoCliente;
	}

	public String getVencCartaoCreditoCliente() {
		return vencCartaoCreditoCliente;
	}

	public void setVencCartaoCreditoCliente(String vencCartaoCreditoCliente) {
		this.vencCartaoCreditoCliente = vencCartaoCreditoCliente;
	}

	public String getNomeTitularCartaoCredito() {
		return nomeTitularCartaoCredito;
	}

	public void setNomeTitularCartaoCredito(String nomeTitularCartaoCredito) {
		this.nomeTitularCartaoCredito = nomeTitularCartaoCredito;
	}

	public String getCpfTitularCartaoCredito() {
		return cpfTitularCartaoCredito;
	}

	public void setCpfTitularCartaoCredito(String cpfTitularCartaoCredito) {
		this.cpfTitularCartaoCredito = cpfTitularCartaoCredito;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	
}