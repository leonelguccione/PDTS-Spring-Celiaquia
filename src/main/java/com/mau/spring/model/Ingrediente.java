package com.mau.spring.model;

<<<<<<< HEAD
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

>>>>>>> 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.persistence.*;

=======
>>>>>>> 
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
<<<<<<< HEAD
public class Ingrediente {
=======
public class Ingrediente
{
>>>>>>> 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIngrediente;
    @ManyToOne
    private Alimento alimento;
    private double cantidad;

    @ManyToOne
    private UnidadDeMedida unidadDeMedida;
}
