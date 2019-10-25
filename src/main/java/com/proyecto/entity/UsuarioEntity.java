package com.proyecto.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity

@Table(name = "usuario")

public class UsuarioEntity {

    @Id
    @GeneratedValue
    @Column(name = "idUsuario")
    private Long idUsuario;

    @OneToOne
    @JoinColumn(name = "idPersona")
    private PersonaEntity persona;

    @Column(name = "contrasena")
    private String contrasena;
}
