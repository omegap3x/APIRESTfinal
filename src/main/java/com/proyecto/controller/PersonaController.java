package com.proyecto.controller;

import com.proyecto.model.Persona;
import com.proyecto.service.persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/{id}/persona")
    public Persona findById( @PathVariable(value = "id", required = true) Long id){
        return personaService.findById(id);
    }

    @GetMapping("/personas")
    public List<Persona> findAll(){
        return personaService.findAll();
    }
    @DeleteMapping("{id}/persona")
    public void deleteById(@PathVariable(value = "id", required = true) Long id){
        personaService.deleteById(id);
    }

    @PostMapping("/persona")
    public void insert(@RequestBody Persona persona){
        personaService.save(persona);
    }

    @PutMapping("/{id}/persona")
    public void update(@RequestBody Persona persona, @PathVariable(value = "id",required = true) Long id){
        persona.setIdPersona(id);
        personaService.save(persona);
    }
}
