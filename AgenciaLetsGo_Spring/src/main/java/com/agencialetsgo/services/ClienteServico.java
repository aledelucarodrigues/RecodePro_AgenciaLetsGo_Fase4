package com.agencialetsgo.services;

import java.util.List;
import com.agencialetsgo.models.Cliente;

public interface ClienteServico {

	List<Cliente> getAllClientes();
	Cliente getClienteById(Long id);
	Cliente saveCliente(Cliente cliente);
	Cliente updateCliente(Long id, Cliente clienteUpdated);
	void deleteClienteById(Long id);
}
