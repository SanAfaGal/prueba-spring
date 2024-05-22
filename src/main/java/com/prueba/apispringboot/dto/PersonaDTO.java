package com.prueba.apispringboot.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PersonaDTO {

    private Long idPersona;
    private String nombrePersona;
    private int edad;
    private String ocupacion;

    public PersonaDTO(Long idPersona, String nombrePersona, int edad, String ocupacion) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public PersonaDTO(String nombrePersona, int edad, String ocupacion) {
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

}

