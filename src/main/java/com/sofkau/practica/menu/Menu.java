package com.sofkau.practica.menu;

import com.sofkau.practica.numbers.utils.Input;

import java.util.logging.Logger;

/**
 * Clase Menu para imprimir un menu.
 *
 * Usa un ciclo do while
 *
 * Hacer un programa que muestre el siguiente menú de opciones
 * ****** GESTION CINEMATOGRÁFICA ********
 * 1-NUEVO ACTOR
 * 2-BUSCAR ACTOR
 * 3-ELIMINAR ACTOR
 * 4-MODIFICAR ACTOR
 * 5-VER TODOS LOS ACTORES
 * 6-VER PELICULAS DE LOS ACTORES
 * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8-SALIR
 *
 * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
 * PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 */
public class Menu {

    public static void main(String[] args) {

        Integer option;
        /**
         * Instancia de la clase  com.sofkau.practica.numbers.utils.Input
         */
        Input input = Input.getInstance();
        Logger logger = Logger.getLogger("logger");
        do{
            logger.info("****** GESTION CINEMATOGRÁFICA ********\n1-NUEVO ACTORe\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6-VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");

            option =input.scan();

        }while (option != 8);
    }
}
