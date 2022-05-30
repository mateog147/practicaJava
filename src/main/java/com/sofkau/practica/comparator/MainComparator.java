package com.sofkau.practica.comparator;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase Main Comparator.
 *
 *Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 *Ver IntComparator
 *
 * Pide por consola que ingresen 2 numeros por teclado por teclado.
 * Usa los metodos Estaticos de la clase IntComparator.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/27
 * @since 1.0.0
 */
public class MainComparator {
    public static void main(String[] args) {
        /**
         * Instancia de la clase logger para imprimir mensajes por consola.
         */
        Logger logger = Logger.getLogger("logger");
        /**
         * Instancia de la clase Scanner para capturar información por teclado.
         */
        Scanner scan = new Scanner(System.in);
        /*Pido que ingresen los numeros*/
        logger.info("Ingre el primer numero:");
        int numberA = scan.nextInt();
        logger.info("Ingre el segundo numero:");
        int numberB = scan.nextInt();

        /*Comparo e imprimo*/
        Optional<String> output= Optional.of(IntComparator.compare(numberA, numberB));
        logger.info(output.get());
    }
}
