package com.sofkau.practica.circulo;

/**
 * Clase de utilidad Circle.
 *
 * Contiene un metodo estatico para calcular el area de un circulo.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.
 */
public class Circle {
    /**
     * Metodo constructor privado para impedir que se intente crear una instancia de clase.
     */
    private Circle(){}

    /**
     * Metodo estatico para calcular el area de un circulo.
     * Se vale del metodo estatico pow de la clase Math.
     * Usa la constante PI de la clase Math.
     *
     * @param radius double radio de cirulo
     * @return double area del circulo
     */
    public static double calculateArea(double radius){
        return Math.PI* Math.pow(radius,2);
    }
}
