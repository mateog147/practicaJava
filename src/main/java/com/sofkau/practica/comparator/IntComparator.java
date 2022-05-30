package com.sofkau.practica.comparator;

/**
 * Clase Int Comparator.
 *
 *  Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 * Si son iguales indicarlo también.
 * Ve cambiando los valores para comprobar que funciona.
 *
 *Clase utilitaria con metodos estaticos para comparar dos valores numericos.
 * Los valores numericos deben ser enteros.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class IntComparator {

    /**
     * Metodo constructor privado para prevenir intentos de instanciar
     */
    private IntComparator() {}

    /**
     * Metodo estatico para comparar 2 enteros y retornar un string.
     * Si los numeros son iguales retorna un mensaje diciendo que son iguales.
     *
     * @param numberA int primer numero a comparar.
     * @param numberB segundo numero a comparar.
     * @return String retorna un mensaje con el numero mayor o diciendo que son iguales.
     */
    public static String compare(int numberA, int numberB){
        if(numberA != numberB){
            String message = "El número mayor es:";
            message += compareMessage(numberA,numberB);
            return message;
        }
        return "Los numeros son iguales";
    }

    /**
     * Compara dos numeros y retorna el un string con el mayor.
     * @param numberA
     * @param numberB
     * @return String con el numero mayor.
     */
    private static String compareMessage(int numberA, int numberB){
        return (numberA > numberB) ? Integer.toString(numberA) : Integer.toString(numberB);
    }
}
