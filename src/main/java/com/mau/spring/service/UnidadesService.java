package com.mau.spring.service;

import com.mau.spring.model.UnidadDeMedida;
<<<<<<< HEAD
import com.mau.spring.repository.RecetaRepository;
import com.mau.spring.repository.UnidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

=======
import com.mau.spring.repository.UnidadesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

>>>>>>> 
@Service
public class UnidadesService {
    private final UnidadesRepository unidadesRepository;

    @Autowired
    public UnidadesService(UnidadesRepository unidadesRepository) {
        this.unidadesRepository = unidadesRepository;
    }

    public List<UnidadDeMedida> getAll(){
        return unidadesRepository.findAll();
    }

    public void addUnidad(UnidadDeMedida nuevaUnidad) {
        unidadesRepository.save(nuevaUnidad);
    }
}
