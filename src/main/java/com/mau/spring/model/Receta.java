package com.mau.spring.model;

<<<<<<< HEAD
=======
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

>>>>>>> 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.persistence.*;
import java.util.Set;

=======
>>>>>>> 
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
<<<<<<< HEAD
public class Receta {
=======
public class Receta
{
>>>>>>> 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReceta;
    private String nombre;
    private String descripcion;
<<<<<<< HEAD
    @OneToMany(cascade = {CascadeType.ALL})
=======
    @OneToMany(cascade = { CascadeType.ALL })
>>>>>>> 
    private Set<Ingrediente> ingredientes;

    private Integer cantidadPlatos;
    private String instrucciones;

    private double energia_kJ;
    private double agua;
    private double proteina;
    private double grasa_total;
    private double carbohidrato_total;
    private double carbohidrato_disponible;
    private double fibra_dietetica;
    private double ceniza;
    private double sodio;
    private double potasio;
    private double calcio;
    private double fosforo;
    private double hierro;
    private double zinc;
    private double tiamina;
    private double rivoflavina;
    private double niacina;
    private double vitamina_c;
    private double acidos_grasos_saturados;
    private double acidos_grasos_monoinsaturados;
    private double acidos_grasos_poliinsaturados;
    private double colesterol;
}
