package com.example.colladodemoprojectgradle.services;

import com.example.colladodemoprojectgradle.entities.Domicilio;
import com.example.colladodemoprojectgradle.repositories.BaseRepository;
import com.example.colladodemoprojectgradle.repositories.DomicilioRepository;
import com.example.colladodemoprojectgradle.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
