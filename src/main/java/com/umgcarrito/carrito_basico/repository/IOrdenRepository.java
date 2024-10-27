package com.umgcarrito.carrito_basico.repository;

import com.umgcarrito.carrito_basico.model.Orden;
import com.umgcarrito.carrito_basico.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository

public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario (Usuario usuario);
}
