package com.agencialetsgo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencialetsgo.models.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {

}
