package com.sofkau.practica.appliances.utils.circle;


import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase Main Cicle para calculo de area de un circulo.
 *
 * Haz una aplicación que calcule el área de un círculo(pi*R2).
 * El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
 * Usa la constante PI y el método pow de Math.
 *
 * Pide por consola que ingresen el radio por teclado.
 * Usa los metodos Estaticos de la clase Circle para calcular el area.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class MainCircle {
    public static void main(String[] args) {
        /**
         * Instancia de la clase logger para imprimir mensajes por consola.
         */
        Logger logger = Logger.getLogger("logger");
        /**
         * Instancia de la clase Scanner para capturar información por teclado.
         */
        Scanner scan = new Scanner(System.in);
        /*Pido que ingrese el radio*/
        logger.info("Ingrese el radio:");
        String radius = scan.nextLine();

        /*Comparo e imprimo*/
        Optional<Double> area= Optional.of(Circle.calculateArea(Double.parseDouble(radius)));
        Optional<String> output= Optional.of(Double.toString(area.get()));
        logger.info(output.get());
    }
}
