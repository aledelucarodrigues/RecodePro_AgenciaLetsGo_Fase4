package com.agencialetsgo.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agencialetsgo.models.Destino;
import com.agencialetsgo.repositories.DestinoRepositorio;
import com.agencialetsgo.services.DestinoServico;

@Service
public class DestinoServicoImpl implements DestinoServico {

	@Autowired
	private DestinoRepositorio dr;
	
	
	@Override
	public List<Destino> getAllDestinos() {
		return dr.findAll();
	}

	@Override
	public Destino getDestinoById(Long id) {
		return dr.findById(id).orElseThrow(()-> new RuntimeException("ID " + id + " Not Found"));
	}

	@Override
	public Destino saveDestino(Destino destino) {
		return dr.save(destino);
	}

	@Override
	public Destino updateDestino(Long id, Destino destinoUpdated) {
		Destino destinoExiste = dr.findById(id).orElseThrow(()-> new RuntimeException("ID " + id + " Not Found"));
		destinoExiste.setNomeDestino(destinoUpdated.getNomeDestino());
		destinoExiste.setDescricaoDestino(destinoUpdated.getDescricaoDestino());
		destinoExiste.setEnderecoDestino(destinoUpdated.getEnderecoDestino());
		destinoExiste.setCidadeDestino(destinoUpdated.getCidadeDestino());
		destinoExiste.setCepDestino(destinoUpdated.getCepDestino());
		destinoExiste.setUfDestino(destinoUpdated.getUfDestino());
		destinoExiste.setPaisDestino(destinoUpdated.getPaisDestino());
		return dr.save(destinoExiste);
	}

	@Override
	public void deleteDestinoById(Long id) {
		dr.deleteById(id);
	}
}
