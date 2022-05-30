package com.sofkau.practica.strings.utils;

import java.util.logging.Logger;

/**
 *Clase Para mostar mensajes en consola.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/29
 * @since 1.0.0
 */
public class Message {

    private static final Logger logger = Logger.getLogger("logger");

    private Message(){}

    /**
     * Metodo para imprimir el menu
     */
    public static void showMenu(){
        logger.info("--MENU--\n1.La sonrisa... \n2.Eliminar espacios\n3.Conteo de vocales\n4.Comparar palabras\n8.Salir");
    }

    /**
     * Imprime en consola un mensaje pasado por parametro.
     * @param word String
     */
    public static void print(String word){
        logger.info(word);
    }

    /**
     * Metodo para imprimir un mensaje con caracteristica de warning.
     * @param error String
     */
    public static void warn(String error){
        logger.warning(error);
    }
}
