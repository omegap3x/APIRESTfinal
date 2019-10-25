package com.proyecto.converter;

import com.proyecto.entity.PersonaEntity;
import com.proyecto.model.Persona;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonaConverter {

    public Persona entityToModel(PersonaEntity personaEntity){
        Persona persona = new Persona();
        persona.setIdPersona(personaEntity.getIdPersona());
        persona.setNombre(personaEntity.getNombre());
        persona.setApellido(personaEntity.getApellido());
        persona.setCorreo(personaEntity.getCorreo());

        return persona;
    }

    public PersonaEntity modelToEntity(Persona persona){
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setIdPersona(persona.getIdPersona());
        personaEntity.setNombre(persona.getNombre());
        personaEntity.setApellido(persona.getApellido());
        personaEntity.setCorreo(persona.getCorreo());

        return personaEntity;
    }

    public List<Persona> entityToModel(List<PersonaEntity> personaEntity){
        List<Persona>personas = new ArrayList<>(personaEntity.size());
        personaEntity.forEach(entity -> {
            personas.add(entityToModel(entity));
        });
        return  personas;
    }

    public Persona entityToModel(Optional<PersonaEntity> personaEntity){
        Persona persona = null;
        if (personaEntity.isPresent()){
            persona.setIdPersona(personaEntity.get().getIdPersona());
            persona.setNombre(personaEntity.get().getNombre());
            persona.setApellido(personaEntity.get().getApellido());

        }
        return persona;
    }

}
