package com.proyecto.service.persona;

import com.proyecto.entity.PersonaEntity;
import com.proyecto.model.Persona;

import java.util.*;

public interface PersonaService {

    Persona findById(Long id);
    List<Persona> findAll();
    void deleteById(Long Id);
    void save(Persona personaEntity);
}
