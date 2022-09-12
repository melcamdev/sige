package com.melcam.sige.service.impl;

import com.melcam.sige.entity.Persona;
import com.melcam.sige.repository.PersonaRepository;
import com.melcam.sige.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }
}
