package com.sofkau.practica.thousand;

import com.sofkau.practica.numbers.utils.Input;
import com.sofkau.practica.numbers.utils.Message;

/**
 * Pequeño programa para imprimir los numeros hasta al 1000 desde un numero ingresado.
 *
 * Resuelve:
 * Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/29
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Input input = Input.getInstance();
        Message.print("Ingrese un numero:");
        Integer iterator = input.scan();

        while(iterator <= 1000){
            Message.print(Integer.toString(iterator));
            if(iterator == 999){
                iterator +=1;
            }else{
                iterator +=2;
            }
        }
    }
}
