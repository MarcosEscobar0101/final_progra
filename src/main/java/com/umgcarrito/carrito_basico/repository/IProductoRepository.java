package com.umgcarrito.carrito_basico.repository;

import com.umgcarrito.carrito_basico.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
