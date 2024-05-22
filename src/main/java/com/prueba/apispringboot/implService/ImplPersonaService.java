package com.prueba.apispringboot.implService;

import com.prueba.apispringboot.dto.PersonaDTO;
import com.prueba.apispringboot.entity.Persona;
import com.prueba.apispringboot.repository.PersonaRepository;
import com.prueba.apispringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplPersonaService implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public List<Persona> obtenerPersonasPorLugar(String lugar) {
        return personaRepository.obtenerPersonasPorLugar(lugar);
    }
}
