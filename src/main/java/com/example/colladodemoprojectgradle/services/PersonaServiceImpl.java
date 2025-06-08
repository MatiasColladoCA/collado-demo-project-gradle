package com.example.colladodemoprojectgradle.services;

import com.example.colladodemoprojectgradle.entities.Persona;
import com.example.colladodemoprojectgradle.repositories.BaseRepository;
import com.example.colladodemoprojectgradle.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired //Ayuda a acceder a los metodos que incluyen la interfaz de PersonaRepository
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
//
//    @Override
//    public List<Persona> findAll() throws Exception {
//        return List.of();
//    }
//
//    @Override
//    public Persona findById(Long aLong) throws Exception {
//        return null;
//    }
//
//    @Override
//    public Persona save(Persona entity) throws Exception {
//        return null;
//    }
//
//    @Override
//    public Persona update(Long aLong, Persona entity) throws Exception {
//        return null;
//    }
//
//    @Override
//    public boolean delete(Long aLong) throws Exception {
//        return false;
//    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }@Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
