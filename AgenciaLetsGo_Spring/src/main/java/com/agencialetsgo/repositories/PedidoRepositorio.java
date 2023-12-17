package com.agencialetsgo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.agencialetsgo.models.Pedido;

import jakarta.transaction.Transactional;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

//	@Transactional
//	@Modifying
//	@Query(nativeQuery=true, value= "INSERT INTO pedido (idCliente, idDestino) VALUES (:clienteId, :destinoId)")
//	void addPedido(@Param("clienteId") Long clienteId, @Param("destinoId")Long destinoId);

}
