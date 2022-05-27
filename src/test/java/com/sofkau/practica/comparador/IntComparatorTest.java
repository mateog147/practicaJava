package com.sofkau.practica.comparador;

import org.junit.Assert;
import org.junit.Test;


public class IntComparatorTest {
    @Test
    public void first_number_higher(){
        Assert.assertEquals("El número mayor es:2", IntComparator.compare(2,1));
        Assert.assertEquals("El número mayor es:4", IntComparator.compare(4,1));
        Assert.assertEquals("El número mayor es:5", IntComparator.compare(5,-4));
    }

    @Test
    public void second_number_higher(){
        Assert.assertEquals("El número mayor es:1", IntComparator.compare(-1,1));
        Assert.assertEquals("El número mayor es:4", IntComparator.compare(3,4));
        Assert.assertEquals("El número mayor es:5", IntComparator.compare(4,5));
    }

    @Test
    public void same_number(){
        Assert.assertEquals("Los numeros son iguales", IntComparator.compare(1,1));
        Assert.assertEquals("Los numeros son iguales", IntComparator.compare(0,0));
        Assert.assertEquals("Los numeros son iguales", IntComparator.compare(-1,-1));
    }
}