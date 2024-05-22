package com.prueba.apispringboot.service;

import com.prueba.apispringboot.dto.PersonaDTO;
import com.prueba.apispringboot.entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService {
    void crearPersona(Persona persona);
    List<Persona> obtenerPersonasPorLugar(String lugar);
}
