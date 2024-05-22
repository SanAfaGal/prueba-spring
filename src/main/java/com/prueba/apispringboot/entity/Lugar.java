package com.prueba.apispringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_lugares")
@Getter
@Setter
@ToString
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lugar")
    private Long idLugar;

    @Column(name = "nombre_lugar")
    private String nombreLugar;

    @Column(name = "departamento_estado")
    private String departamentoEstado;

    @Column(name = "pais")
    private String pais;

    @ManyToOne
    @JoinColumn(name = "fk_persona")
    private Persona persona;

    public Lugar(){}

    public Lugar(String nombreLugar, String departamentoEstado, String pais, Long idPersona) {
        this.nombreLugar = nombreLugar;
        this.departamentoEstado = departamentoEstado;
        this.pais = pais;
        this.persona = new Persona(idPersona);
    }
}
