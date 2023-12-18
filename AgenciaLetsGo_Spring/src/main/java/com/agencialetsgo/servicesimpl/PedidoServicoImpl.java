package com.agencialetsgo.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencialetsgo.models.Pedido;
import com.agencialetsgo.repositories.PedidoRepositorio;
import com.agencialetsgo.services.PedidoServico;

@Service
public class PedidoServicoImpl implements PedidoServico {

	@Autowired
	private PedidoRepositorio pr;
		
	@Override
	public List<Pedido> getAllPedidos() {
		return pr.findAll();
	}

	@Override
	public Pedido getPedidoById(Long id) {
		return pr.findById(id).orElseThrow(()-> new RuntimeException("ID " + id + " Not Found"));
	}

	@Override
	public Pedido savePedido(Pedido pedido) {
		return pr.save(pedido);
	}

	@Override
	public Pedido updatePedido(Long id, Pedido pedidoUpdated) {
		Pedido pedidoExiste = pr.findById(id).orElseThrow(()-> new RuntimeException("ID " + id + " Not Found"));
		pedidoExiste.setDataInicioViagem(pedidoUpdated.getDataInicioViagem());
		pedidoExiste.setDataFimViagem(pedidoUpdated.getDataFimViagem());
		pedidoExiste.setFormaPagamento(pedidoUpdated.getFormaPagamento());
		pedidoExiste.setViajantesPedido(pedidoUpdated.getViajantesPedido());
		return pr.save(pedidoExiste);
	}

	@Override
	public void deletePedidoById(Long id) {
		pr.deleteById(id);
	}
		

}
