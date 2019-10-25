package com.proyecto.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuarioVideo")

public class UsuarioVideoEntity {

    @Id
    @GeneratedValue
    @Column(name = "idUsuarioVideo")
    private Long idUsuarioVideo;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario;

    @ManyToOne()
    @JoinColumn(name = "idVideo")
    private VideoEntity videos;
}
