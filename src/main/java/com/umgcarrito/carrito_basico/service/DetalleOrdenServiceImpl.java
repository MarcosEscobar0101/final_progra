package com.umgcarrito.carrito_basico.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umgcarrito.carrito_basico.model.DetalleOrden;
import com.umgcarrito.carrito_basico.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {  // Implementa la interfaz
    @Autowired
    private IDetalleOrdenRepository detalleOrdenRepository;

    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {  // Asegúrate de que el método esté sobrescrito correctamente
        return detalleOrdenRepository.save(detalleOrden);
    }
}