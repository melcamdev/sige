package com.melcam.sige.controller;

import com.melcam.sige.entity.Persona;
import com.melcam.sige.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping
    public List<Persona> getAll() {
        return personaService.getAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Persona nuevo(@RequestBody Persona persona) {
        return personaService.crearPersona(persona);
    }
}
