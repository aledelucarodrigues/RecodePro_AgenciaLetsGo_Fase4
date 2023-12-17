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

import com.agencialetsgo.models.Cliente;
import com.agencialetsgo.services.ClienteServico;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteServico cs;
	
	@PostMapping("/savecliente")
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return cs.saveCliente(cliente);
	}
	
	@GetMapping("/allclientes")
	public List<Cliente> getAllClientes(){
		return cs.getAllClientes();
		}
	
	@GetMapping("/{idCliente}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long idCliente){
		Cliente cliente = cs.getClienteById(idCliente);
		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("{idCliente}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable Long idCliente, @RequestBody Cliente clienteUpdated){
	Cliente clienteExiste = cs.getClienteById(idCliente);
	clienteExiste.setNomeCliente(clienteUpdated.getNomeCliente());
	clienteExiste.setCpfCliente(clienteUpdated.getCpfCliente());
	clienteExiste.setTelefoneCliente(clienteUpdated.getTelefoneCliente());
	clienteExiste.setEnderecoCliente(clienteUpdated.getEnderecoCliente());
	clienteExiste.setCidadeCliente(clienteUpdated.getCidadeCliente());
	clienteExiste.setCepCliente(clienteUpdated.getCepCliente());
	clienteExiste.setUfCliente(clienteUpdated.getUfCliente());
	clienteExiste.setEmailCliente(clienteUpdated.getEmailCliente());
	clienteExiste.setSenhaCliente(clienteUpdated.getSenhaCliente());
	clienteExiste.setCartaoCreditoCliente(clienteUpdated.getCartaoCreditoCliente());
	clienteExiste.setVencCartaoCreditoCliente(clienteUpdated.getVencCartaoCreditoCliente());
	clienteExiste.setNomeTitularCartaoCredito(clienteUpdated.getNomeTitularCartaoCredito());
	clienteExiste.setCpfTitularCartaoCredito(clienteUpdated.getCpfTitularCartaoCredito());
	
	cs.saveCliente(clienteExiste);
	
	return ResponseEntity.ok(clienteExiste);
	}
	
	@DeleteMapping("/{idCliente}")
	public void deleteCliente(@PathVariable Long idCliente) {
		cs.deleteClienteById(idCliente);
	}
}
