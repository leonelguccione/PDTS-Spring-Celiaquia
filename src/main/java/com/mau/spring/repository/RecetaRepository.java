package com.mau.spring.repository;

import com.mau.spring.model.Receta;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

=======

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

>>>>>>> 
@Repository
public interface RecetaRepository  extends JpaRepository<Receta,Integer> {
    List<Receta> findByNombre(String nombre);
}
