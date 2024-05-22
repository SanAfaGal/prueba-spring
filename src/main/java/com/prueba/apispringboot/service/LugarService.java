package com.prueba.apispringboot.service;

import com.prueba.apispringboot.entity.Lugar;

import java.util.List;

public interface LugarService {
    void crearLugar(Lugar lugar);
    List<Lugar> obtenerLugaresPorPais(String pais);
}
