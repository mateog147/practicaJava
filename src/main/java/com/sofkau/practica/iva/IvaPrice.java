package com.sofkau.practica.iva;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase precio con IVA
 *
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
 * El IVA sera una constante que sera del 21%.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/28
 * @since 1.0.0
 */
public class IvaPrice {
    /**
     * Constate del IVA del 21%
     * */
    private static final double IVA = 0.21;


    public static void main(String[] args) {
        /**
         * Instancia de la clase Logger para mostrar mensajes en consola.
         */
        Logger logger = Logger.getLogger("logger");
        /**
         * Instancia de la clase Escaner para captura de datos
         */
        Scanner scan = new Scanner(System.in);
        /*Pido que ingrese el precio*/
        logger.info("Ingrese el precio base:");
        double basePrice = scan.nextDouble();

        /*Calculo e imprimo*/
        Optional<Double> price= Optional.of(basePrice+(basePrice*IVA));
        Optional<String> output= Optional.of("precio final con IVA: "+Double.toString(price.get()));
        logger.info(output.get());
    }
}
