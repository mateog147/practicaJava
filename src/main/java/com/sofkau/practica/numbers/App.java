package com.sofkau.practica.numbers;

import com.sofkau.practica.numbers.utils.Input;
import com.sofkau.practica.numbers.utils.Iterator;
import com.sofkau.practica.numbers.utils.Message;

public class App {
    private static Iterator iterator = Iterator.getInstance();
    public static void main(String[] args) {
        Integer option;
        Input input = Input.getInstance();


        do{
            Message.showMenu();
            option = input.scan();
            menu(option);
        }while (option != 0);
    }

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
