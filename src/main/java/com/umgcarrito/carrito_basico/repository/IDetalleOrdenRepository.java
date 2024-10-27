package com.umgcarrito.carrito_basico.repository;

import com.umgcarrito.carrito_basico.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {
}
