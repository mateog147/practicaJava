package com.sofkau.practica.iva;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

public class IvaPrice {
    /**
     * Constate del IVA del 21%
     * */
    private static final double IVA = 0.21;

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
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
