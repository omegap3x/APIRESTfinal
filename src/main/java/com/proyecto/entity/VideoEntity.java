package com.proyecto.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "video")
public class VideoEntity {
    @Id
    @GeneratedValue

    @Column(name ="idVideo")
    private long idVideo;

    @Column(name ="ruta")
    private String ruta;

    @Column(name ="titulo")
    private String titulo;

    @Column(name ="descripcion")
    private String descripcion;

    @OneToOne
    @JoinColumn(name ="nombreCategoria")
    private CategoriaEntity categoria;
}
