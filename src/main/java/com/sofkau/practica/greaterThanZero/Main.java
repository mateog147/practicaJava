package com.sofkau.practica.greaterThanZero;

import com.sofkau.practica.greaterThanZero.utils.Input;
import java.util.logging.Logger;

/**
 * Programa basico que pide un numero hasta que el numero ingresado sea mayor o igual a 0.
 *
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while),
 * después muestra ese número por consola.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/28
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Numero que ingresa el usuario
         */
        Double number;
        /**
         * Instancia de la clase Input
         */
        Input input = Input.getInstance();
        /**
         * Instancia de la clase Logger para imprimir mensajes en consola
         */
        Logger logger =  Logger.getLogger("Logger");
        /*Ciclo do while que pide un numero hasta que el ingresado sea mayor a -1*/
        do{
            logger.info("Ingrese un numero:");
            number = input.scan();
        }while(number < 0);
    }
}
