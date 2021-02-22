package com.mau.spring.controller;

<<<<<<< HEAD
import com.mau.spring.model.Alimento;
import com.mau.spring.model.Receta;
import com.mau.spring.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receta")
public class RecetaController {
    private final RecetaService recetaService;

    @Autowired
    public RecetaController(RecetaService recetaService) {
=======
import com.mau.spring.model.Receta;
import com.mau.spring.service.RecetaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receta")
public class RecetaController
{
    private final RecetaService recetaService;

    @Autowired
    public RecetaController(RecetaService recetaService)
    {
>>>>>>> 
        this.recetaService = recetaService;
    }

    @PostMapping("/")
<<<<<<< HEAD
    public void addReceta(@RequestBody(required = true) Receta nuevaReceta){
=======
    public void addReceta(@RequestBody(required = true) Receta nuevaReceta)
    {
>>>>>>> 
        recetaService.addReceta(nuevaReceta);
    }

    @PostMapping("/modificar")
<<<<<<< HEAD
    public void modificarReceta(@RequestBody(required = true) Receta nuevaReceta){
=======
    public void modificarReceta(@RequestBody(required = true) Receta nuevaReceta)
    {
>>>>>>> 
        recetaService.modificarReceta(nuevaReceta);
    }

    @GetMapping("/")
<<<<<<< HEAD
    public List<Receta> getAll(@RequestParam(required = false) String name){
=======
    public List<Receta> getAll(@RequestParam(required = false) String name)
    {
>>>>>>> 
        return recetaService.getAll(name);
    }

    @DeleteMapping("/{idReceta}")
<<<<<<< HEAD
    public void deleteReceta(@PathVariable Integer idReceta){
=======
    public void deleteReceta(@PathVariable Integer idReceta)
    {
>>>>>>> 
        recetaService.deleteReceta(idReceta);
    }


}
