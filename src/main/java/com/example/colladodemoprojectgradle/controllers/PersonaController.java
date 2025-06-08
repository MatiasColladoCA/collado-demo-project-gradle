package com.example.colladodemoprojectgradle.controllers;

import com.example.colladodemoprojectgradle.entities.Persona;
import com.example.colladodemoprojectgradle.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*") //Permitir acceso a API desde distintos origenes (clientes)
@RequestMapping(path="api/v1/personas") //URI o URL para acceder a los recursos
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
    private PersonaServiceImpl personaServiceImpl;
    public PersonaController(PersonaServiceImpl personaServiceImpl) {
        this.personaServiceImpl = personaServiceImpl;
    }

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findAll());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.findById(id));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Persona entity) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.save(entity));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Persona entity) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(personaServiceImpl.update(id, entity));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personaServiceImpl.delete(id));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
}

