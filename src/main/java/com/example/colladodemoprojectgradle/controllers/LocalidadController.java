package com.example.colladodemoprojectgradle.controllers;

import com.example.colladodemoprojectgradle.entities.Localidad;
import com.example.colladodemoprojectgradle.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController  extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}