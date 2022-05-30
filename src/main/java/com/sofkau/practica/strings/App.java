package com.sofkau.practica.strings;

import com.sofkau.practica.strings.utils.Message;
import com.sofkau.practica.strings.utils.Input;
import com.sofkau.practica.strings.utils.StringModifier;

/**
 * Clase para Manipulción de cadenas ingrsadas por consola.
 *
 * Consultar la clase StringModifier para ver los 4 problema solucionados.
 *
 * Se implementa un menu dentro de un ciclo do while.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/29
 * @since 1.0.0
 */
public class App {
    /**
     * Instancia de la clase StringModifier
     */
    static StringModifier modifier = StringModifier.getInstance();

    public static void main(String[] args) {
        Integer option;
        Input input = Input.getInstance();
        do{
            Message.showMenu();
            option = input.number();
            menu(option);
        }while (option != 8);
    }

    private static void menu(Integer op){
        switch (op){
            case 1 -> modifier.sentenceAdd();
            case 2 -> modifier.deleteSpaces();
            case 3 -> modifier.countVowels();
            case 4 -> modifier.spotDifferences();
            default -> Message.print("Opción no valida");
        }
    }
}
