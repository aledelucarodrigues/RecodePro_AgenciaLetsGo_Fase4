package com.agencialetsgo.services;

import java.util.List;
import com.agencialetsgo.models.Destino;

public interface DestinoServico {

	List<Destino> getAllDestinos();
	Destino getDestinoById(Long id);
	Destino saveDestino(Destino destino);
	Destino updateDestino(Long id, Destino destinoUpdated);
	void deleteDestinoById(Long id);
}
