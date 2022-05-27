package com.sofkau.practica.comparador;

public class IntComparator {

    private IntComparator() {
            throw new IllegalStateException("Utility class");
    }

    public static String compare(int numberA, int numberB){
        if(numberA != numberB){
            String message = "El número mayor es:";
            message += compareMessage(numberA,numberB);
            return message;
        }
        return "Los numeros son iguales";
    }

    private static String compareMessage(int numberA, int numberB){
        return (numberA > numberB) ? Integer.toString(numberA) : Integer.toString(numberB);
    }
}
