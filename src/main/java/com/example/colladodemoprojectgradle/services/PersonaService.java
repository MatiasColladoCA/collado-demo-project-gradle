package com.example.colladodemoprojectgradle.services;

import com.example.colladodemoprojectgradle.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;


}
