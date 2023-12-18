package com.agencialetsgo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencialetsgo.models.Pedido;
import com.agencialetsgo.services.PedidoServico;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoServico ps;
	
	@PostMapping("/savepedido")
	public Pedido createPedido(@RequestBody Pedido pedido) {
		return ps.savePedido(pedido);
	}
	
	@GetMapping("/allpedidos")
	public List<Pedido> getAllPedidos(){
		return ps.getAllPedidos();
		}
	
	@GetMapping("/{idPedido}")
	public ResponseEntity<Pedido> getPedidoById(@PathVariable Long idPedido){
		Pedido pedido = ps.getPedidoById(idPedido);
		return ResponseEntity.ok(pedido);
	}
	
	@PutMapping("{idPedido}")
	public ResponseEntity<Pedido> updatePedido(@PathVariable Long idPedido, @RequestBody Pedido pedidoUpdated){
	Pedido pedido = ps.getPedidoById(idPedido);
	pedido.setDataInicioViagem(pedidoUpdated.getDataInicioViagem());
	pedido.setDataFimViagem(pedidoUpdated.getDataFimViagem());
	pedido.setFormaPagamento(pedidoUpdated.getFormaPagamento());
	pedido.setViajantesPedido(pedidoUpdated.getViajantesPedido());
	
	ps.savePedido(pedido);
	
	return ResponseEntity.ok(pedido);
	}
	
	@DeleteMapping("/{idPedido}")
	public void deletePedido(@PathVariable Long idPedido) {
		ps.deletePedidoById(idPedido);
	}
	
}
