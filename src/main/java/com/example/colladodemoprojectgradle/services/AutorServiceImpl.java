package com.example.colladodemoprojectgradle.services;

import com.example.colladodemoprojectgradle.entities.Autor;
import com.example.colladodemoprojectgradle.repositories.AutorRepository;
import com.example.colladodemoprojectgradle.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
