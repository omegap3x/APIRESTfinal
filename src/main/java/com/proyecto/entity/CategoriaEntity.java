package com.proyecto.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue

    @Column(name = "id")
    private long id;


    @Column(name = "nombreCategoria")
    private String nombreCategoria;

}
