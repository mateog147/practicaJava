package com.sofkau.practica.circulo;


import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainCircle {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
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
