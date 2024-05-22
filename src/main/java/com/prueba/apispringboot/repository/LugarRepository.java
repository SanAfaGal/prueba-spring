package com.prueba.apispringboot.repository;

import com.prueba.apispringboot.entity.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LugarRepository extends JpaRepository<Lugar, Long> {

    @Query("SELECT l FROM Lugar l WHERE l.pais = :pais")
    List<Lugar> obtenerLugaresPorPais(@Param("pais") String pais);
}