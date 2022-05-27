package com.sofkau.practica.comparador;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainComparator {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
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
