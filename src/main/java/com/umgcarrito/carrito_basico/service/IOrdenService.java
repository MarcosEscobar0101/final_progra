package com.umgcarrito.carrito_basico.service;

import com.umgcarrito.carrito_basico.model.Orden;
import com.umgcarrito.carrito_basico.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IOrdenService {
    List<Orden> findAll();
    Optional<Orden> findById(Integer id);
    Orden save (Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario (Usuario usuario);
}
