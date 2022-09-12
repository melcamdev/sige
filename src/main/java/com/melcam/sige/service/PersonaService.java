package com.melcam.sige.service;

import com.melcam.sige.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> getAll();

    Persona crearPersona(Persona persona);
}
