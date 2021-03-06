package com.sofkau.practica.numbers.utils;

import java.util.Scanner;

/**
 *Clase Input.
 *
 * Permite el ingreso de valores por teclado y los valida.
 * Siempre retorna la mimsma instancia de esta clase.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/28
 * @since 1.0.0
 */
public class Input {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final Input INPUT = new Input();

    private Input() {
    }
    /**
     * Metodo para obtener la instancia de clase.
     * @return Input
     */
    public static Input getInstance() {
        return INPUT;
    }

    /**
     * Retorna el valor ingresado, si es invalida la entrada retorna 100.
     * @return Integer
     */
    public Integer scan(){
        Integer in;
        try {
            in = Integer.parseInt(SCAN.nextLine());
        }catch (Exception e){
            Message.warn("Solo se aceptan entradas numericas");
            return 100;
        }
        return in;
    }
}
