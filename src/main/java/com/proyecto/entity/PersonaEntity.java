package com.proyecto.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")

public class PersonaEntity{

    @Id
    @GeneratedValue
    @Column(name = "idPersona")
    private Long idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    public Long getIdPersona() {
        return idPersona;
    }


}