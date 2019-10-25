package com.proyecto.service.persona.impl;

import com.proyecto.converter.PersonaConverter;
import com.proyecto.model.Persona;
import com.proyecto.repository.PersonaRepository;
import com.proyecto.service.persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaConverter converter;


    @Override
    public Persona findById(Long id) {
        return converter.entityToModel(personaRepository.findById(id));
    }

    @Override
    public List<Persona> findAll() {
        return converter.entityToModel(personaRepository.findAll());
    }

    @Override
    public void deleteById(Long id) { personaRepository.deleteById(id);

    }

    @Override
    public void save(Persona persona) {
        personaRepository.save(converter.modelToEntity(persona));

    }
}
