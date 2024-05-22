package com.prueba.apispringboot.controller;

import com.prueba.apispringboot.dto.PersonaDTO;
import com.prueba.apispringboot.entity.Persona;
import com.prueba.apispringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearPersona(@RequestParam String nombrePersona, @RequestParam Integer edad, @RequestParam String ocupacion) {
        Persona nuevaPersona = new Persona(nombrePersona, edad, ocupacion);
        personaService.crearPersona(nuevaPersona);
        return ResponseEntity.ok("Persona creada con éxito");
    }

    @GetMapping("/lugares")
    public ResponseEntity<List<Persona>> obtenerPersonasPorLugar(@RequestParam String lugar) {
        List<Persona> personas = personaService.obtenerPersonasPorLugar(lugar);
        return ResponseEntity.ok(personas);
    }

}
