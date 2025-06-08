package com.example.colladodemoprojectgradle.services;

import com.example.colladodemoprojectgradle.entities.Libro;
import com.example.colladodemoprojectgradle.repositories.BaseRepository;
import com.example.colladodemoprojectgradle.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
