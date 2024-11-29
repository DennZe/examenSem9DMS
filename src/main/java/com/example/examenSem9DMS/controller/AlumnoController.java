package com.example.examenSem9DMS.controller;

import com.example.examenSem9DMS.model.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @GetMapping("/alumno")
    public Alumno getAlumno() {
        return new Alumno("12345678", "Juan", "Pérez López", "987654321");
    }
}
