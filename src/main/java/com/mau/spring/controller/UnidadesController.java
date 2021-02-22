package com.mau.spring.controller;

import com.mau.spring.model.UnidadDeMedida;
import com.mau.spring.service.UnidadesService;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidades")
public class UnidadesController {
    private final UnidadesService unidadesService;

    @Autowired
    public UnidadesController(UnidadesService unidadesService) {
=======

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidades")
public class UnidadesController
{
    private final UnidadesService unidadesService;

    @Autowired
    public UnidadesController(UnidadesService unidadesService)
    {
>>>>>>> 
        this.unidadesService = unidadesService;
    }

    @GetMapping("/")
<<<<<<< HEAD
    public List<UnidadDeMedida> getAll() {
=======
    public List<UnidadDeMedida> getAll()
    {
>>>>>>> 
        return unidadesService.getAll();
    }

    @PostMapping("/")
<<<<<<< HEAD
    public void addUnidad(@RequestBody UnidadDeMedida nuevaUnidad) {
=======
    public void addUnidad(@RequestBody UnidadDeMedida nuevaUnidad)
    {
>>>>>>> 
        unidadesService.addUnidad(nuevaUnidad);
    }
}
