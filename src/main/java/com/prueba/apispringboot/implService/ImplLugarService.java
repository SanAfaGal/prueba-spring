package com.prueba.apispringboot.implService;

import com.prueba.apispringboot.entity.Lugar;
import com.prueba.apispringboot.repository.LugarRepository;
import com.prueba.apispringboot.service.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplLugarService implements LugarService {

    @Autowired
    private LugarRepository lugarRepository;

    @Override
    public void crearLugar(Lugar lugar) {
        lugarRepository.save(lugar);
    }

    @Override
    public List<Lugar> obtenerLugaresPorPais(String pais) {
        return lugarRepository.obtenerLugaresPorPais(pais);
    }


}
