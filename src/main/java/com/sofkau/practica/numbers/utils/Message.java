package com.sofkau.practica.numbers.utils;

import java.util.logging.Logger;

public class Message {
    private static final Logger logger = Logger.getLogger("logger");

    private Message(){}

    public static void showMenu(){
        logger.info("--MENU--\n1.Pares ciclo while\n2.Impares ciclo while\n3.Pares ciclo for\n4.Impares ciclo for\n0.Salir");
    }

    public static void print(String word){
        logger.info(word);
    }

    public static void warn(String error){
        logger.warning(error);
    }
}
