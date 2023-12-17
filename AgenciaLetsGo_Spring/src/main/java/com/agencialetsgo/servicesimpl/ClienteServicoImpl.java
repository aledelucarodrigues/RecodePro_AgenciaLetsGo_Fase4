package com.agencialetsgo.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencialetsgo.models.Cliente;
import com.agencialetsgo.repositories.ClienteRepositorio;
import com.agencialetsgo.services.ClienteServico;

@Service
public class ClienteServicoImpl implements ClienteServico {

	@Autowired
	private ClienteRepositorio cr;
	
	
	@Override
	public List<Cliente> getAllClientes() {
		return cr.findAll();
	}

	@Override
	public Cliente getClienteById(Long id) {
		return cr.findById(id).orElseThrow(()-> new RuntimeException("ID " + id + " Not Found"));
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		return cr.save(cliente);
	}

	@Override
	public Cliente updateCliente(Long id, Cliente clienteUpdated) {
		Cliente clienteExiste = cr.findById(id).orElseThrow(()-> new RuntimeException("ID " + id + " Not Found"));
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
		return cr.save(clienteExiste);
	}

	@Override
	public void deleteClienteById(Long id) {
		cr.deleteById(id);
	}

}
