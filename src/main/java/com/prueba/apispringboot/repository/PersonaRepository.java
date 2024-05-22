package com.prueba.apispringboot.repository;

import com.prueba.apispringboot.dto.PersonaDTO;
import com.prueba.apispringboot.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Query("SELECT p FROM Persona p JOIN Lugar l ON l.persona.idPersona = p.idPersona WHERE l.nombreLugar = :lugar")
    List<Persona> obtenerPersonasPorLugar(@Param("lugar") String lugar);
}
