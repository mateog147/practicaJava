package com.sofkau.practica.greaterThanZero.utils;

import com.sofkau.practica.numbers.utils.Message;

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
    /**
     * Instancia de la clase Scanner
     */
    private static final Scanner SCAN = new Scanner(System.in);
    /**
     * Unica instancia de clase
     */
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
     * Metodo que lee por teclado el ingreso valida la entrada.
     * Si la entrada es invalida retorna -1
     * @return Double
     */
    public Double scan(){
        Double in;
        try {
            in = Double.parseDouble(SCAN.nextLine());
        }catch (Exception e){
            Message.warn("Solo se aceptan entradas numericas");
            return (double)-1;
        }
        return in;
    }
}
