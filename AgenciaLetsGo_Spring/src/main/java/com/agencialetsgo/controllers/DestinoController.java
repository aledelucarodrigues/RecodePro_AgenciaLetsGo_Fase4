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

import com.agencialetsgo.models.Destino;
import com.agencialetsgo.services.DestinoServico;

@RestController
@RequestMapping("/destino")
public class DestinoController {

	@Autowired
	private DestinoServico ds;
	
	@PostMapping("/savedestino")
	public Destino createDestino(@RequestBody Destino destino) {
		return ds.saveDestino(destino);
	}
	
	@GetMapping("/alldestinos")
	public List<Destino> getAllDestinos(){
		return ds.getAllDestinos();
		}
	
	@GetMapping("/{idDestino}")
	public ResponseEntity<Destino> getDestinoById(@PathVariable Long idDestino){
		Destino destino = ds.getDestinoById(idDestino);
		return ResponseEntity.ok(destino);
	}
	
	@PutMapping("{idDestino}")
	public ResponseEntity<Destino> updateDestino(@PathVariable Long idDestino, @RequestBody Destino destinoUpdated){
	Destino destinoExiste = ds.getDestinoById(idDestino);
	destinoExiste.setNomeDestino(destinoUpdated.getNomeDestino());
	destinoExiste.setDescricaoDestino(destinoUpdated.getDescricaoDestino());
	destinoExiste.setEnderecoDestino(destinoUpdated.getEnderecoDestino());
	destinoExiste.setCidadeDestino(destinoUpdated.getCidadeDestino());
	destinoExiste.setCepDestino(destinoUpdated.getCepDestino());
	destinoExiste.setUfDestino(destinoUpdated.getUfDestino());
	destinoExiste.setPaisDestino(destinoUpdated.getPaisDestino());
	
	ds.saveDestino(destinoExiste);
	
	return ResponseEntity.ok(destinoExiste);
	}
	
	@DeleteMapping("/{idDestino}")
	public void deleteDestino(@PathVariable Long idDestino) {
		ds.deleteDestinoById(idDestino);
	}
}
