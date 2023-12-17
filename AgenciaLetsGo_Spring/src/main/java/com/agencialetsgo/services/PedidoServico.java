package com.agencialetsgo.services;

import java.util.List;

import com.agencialetsgo.models.Pedido;

public interface PedidoServico {

	List<Pedido> getAllPedidos();
	Pedido getPedidoById(Long id);
	Pedido savePedido(Pedido pedido);
	Pedido updatePedido(Long id, Pedido pedidoUpdated);
	void deletePedidoById(Long id);
	
//	void addPedido(Long clienteId, Long destinoId);
	
}
