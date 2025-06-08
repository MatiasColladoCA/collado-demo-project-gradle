package com.example.colladodemoprojectgradle.services;

import com.example.colladodemoprojectgradle.entities.Localidad;
import com.example.colladodemoprojectgradle.repositories.BaseRepository;
import com.example.colladodemoprojectgradle.repositories.LibroRepository;
import com.example.colladodemoprojectgradle.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
