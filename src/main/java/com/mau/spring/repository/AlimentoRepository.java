package com.mau.spring.repository;


import com.mau.spring.model.Alimento;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento,Integer> { //un repository es una abstraccion de la capa de base de datos (una IPersistencia)

    List<Alimento> findByNombre(String nombre); //se hace automaticamente solo por que el nombre del metodo es findByName, entonces hace un SELECT FROM WHERE nombre = nombre

//    @Query(value = "Select * from alimento where weight = ?1", nativeQuery = true)
//    List<Alimento> findByWeight(int weight);
=======

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Integer>
{ //un repository es una abstraccion de la capa de base de datos (una IPersistencia)

    List<Alimento> findByNombre(String nombre); //se hace automaticamente solo porque el nombre del metodo es findByName, entonces hace un SELECT FROM WHERE nombre = nombre

    Optional findById(int id);

    //    @Query(value = "Select * from alimento where weight = ?1", nativeQuery = true)
    //    List<Alimento> findByWeight(int weight);
>>>>>>> 


}
