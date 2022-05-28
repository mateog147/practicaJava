package com.sofkau.practica.numbers;

import com.sofkau.practica.numbers.utils.Input;
import com.sofkau.practica.numbers.utils.Iterator;
import com.sofkau.practica.numbers.utils.Message;

/**
 * Clase para Mostrar por dos metodologias distintas los numeros pares e impares del 1 al 100.
 *
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 * Realiza el ejercicio anterior usando un ciclo for.
 *
 * Se implementa un menu dentro de un ciclo do while.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/28
 * @since 1.0.0
 */
public class App {
    /**
     * Atributo de clase instancia de la clase Iterator.
     */
    private static Iterator iterator = Iterator.getInstance();

    public static void main(String[] args) {
        /**
         * Variable de control de la opción para el menu.
         */
        Integer option;
        /**
         * Instancia de la clase Input para ingreso de datos
         */
        Input input = Input.getInstance();

        do{
            Message.showMenu();
            option = input.scan();
            menu(option);
        }while (option != 0);
    }

    /**
     * Metodo con un switch para manejo del menu.
     * Usa  los metodos del atributo Iteretor.
     * @param  op Integer
     */
    private static void menu(Integer op){
        switch (op){
            case 1 -> iterator.whileOdd();
            case 2 -> iterator.whileEven();
            case 3 -> iterator.forOdd();
            case 4 -> iterator.forEven();
            case 0 -> Message.print("Cerrando");
            default -> Message.print("Entrada Invalida");
        }
    }
}
