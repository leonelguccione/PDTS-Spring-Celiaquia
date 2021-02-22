package com.mau.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//TODO revisar nombre
@Data
@AllArgsConstructor
<<<<<<< HEAD
public class AccesibleDTO {
    private int numero
            ;
    private boolean esAccesible;
=======
public class AccesibleDTO
{
    private int numero;
    private boolean accesible;

    public int getNumero()
    {
        return (this.numero);
    }

    public boolean getAccesible()
    {
        return this.accesible;
    }
>>>>>>> 
}
