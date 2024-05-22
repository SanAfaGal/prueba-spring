package com.prueba.apispringboot.controller;

import com.prueba.apispringboot.entity.Lugar;
import com.prueba.apispringboot.entity.Persona;
import com.prueba.apispringboot.service.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares")
public class LugarController {
    @Autowired
    private LugarService lugarService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearLugar(@RequestParam String nombreLugar, @RequestParam String departamentoEstado, @RequestParam String pais, @RequestParam Long idPersona) {
        Lugar nuevoLugar = new Lugar(nombreLugar, departamentoEstado, pais, idPersona);
        lugarService.crearLugar(nuevoLugar);
        return ResponseEntity.ok("Lugar creado con éxito");
    }

    @GetMapping()
    public ResponseEntity<List<Lugar>> obtenerLugaresPorPais(@RequestParam String pais) {
        List<Lugar> lugares = lugarService.obtenerLugaresPorPais(pais);
        return ResponseEntity.ok(lugares);
    }
}
