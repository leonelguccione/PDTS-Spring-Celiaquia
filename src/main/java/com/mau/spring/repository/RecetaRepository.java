package com.mau.spring.repository;

import com.mau.spring.model.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository  extends JpaRepository<Receta,Integer> {
    List<Receta> findByNombre(String nombre);
}
