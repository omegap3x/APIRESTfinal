package com.proyecto.repository;

import com.proyecto.entity.UsuarioVideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioVideo extends JpaRepository<UsuarioVideoEntity,Long> {
}
