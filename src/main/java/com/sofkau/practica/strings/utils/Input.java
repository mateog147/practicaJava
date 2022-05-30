package com.sofkau.practica.strings.utils;


import java.util.Scanner;

/**
 *Clase Input.
 *
 * Permite el ingreso de valores por teclado y los valida.
 * Siempre retorna la mimsma instancia de esta clase.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/29
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
     * Metodo que lee por teclado un string, el ingreso valida la entrada.
     * Si la entrada es invalida retorna un String vacío
     * @return Double
     */
    public String line(){
        String input;
        try {
            input = SCAN.nextLine();
        }catch (Exception e){
            Message.warn("Entrada invalida");
            return "";
        }
        return input;
    }

    /**
     * Metodo que lee por teclado un integer, el ingreso valida la entrada.
     * Si la entrada es invalida retorna un String vacío
     * @return Integer
     */
    public Integer number(){
        Integer in;
        try {
            in = Integer.parseInt(SCAN.nextLine());
        }catch (Exception e){
            Message.warn("Solo se aceptan entradas numericas");
            return 0;
        }
        return in;
    }
}
