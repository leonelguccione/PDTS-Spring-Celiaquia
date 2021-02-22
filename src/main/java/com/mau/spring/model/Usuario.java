package com.mau.spring.model;

<<<<<<< HEAD
import lombok.Data;
=======
import java.time.ZonedDateTime;

import java.util.Date;
>>>>>>> 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
=======

import lombok.Data;
>>>>>>> 

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nombre;
    private String apellido;
    private Date fecha_de_nacimiento;
    private boolean es_celiaco;
    private Date fecha_diagnostico_celiaquia;
    private boolean en_tratamiento_medico;
    private boolean sigue_dieta_sin_gluten;
    private boolean come_carnes;
    private boolean come_verduras;
    private boolean come_frutas;
    private ZonedDateTime fecha_ultima_actividad;
    private FrecuenciaGluten frecuencia_ingestion_gluten;
}
