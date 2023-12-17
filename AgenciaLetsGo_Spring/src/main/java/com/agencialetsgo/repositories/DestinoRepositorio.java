package com.agencialetsgo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencialetsgo.models.Destino;

@Repository
public interface DestinoRepositorio extends JpaRepository<Destino, Long> {

}
