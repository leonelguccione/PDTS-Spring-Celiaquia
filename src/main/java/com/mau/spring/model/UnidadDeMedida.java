package com.mau.spring.model;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
=======
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> 

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
<<<<<<< HEAD
public class UnidadDeMedida {
=======
@SuppressWarnings({ "oracle.jdeveloper.java.annotation-callback", "oracle.jdeveloper.ejb.entity-class-auto-id-gen" })
public class UnidadDeMedida
{
>>>>>>> 
    @Id
    private int id;
    private String nombre;

}
