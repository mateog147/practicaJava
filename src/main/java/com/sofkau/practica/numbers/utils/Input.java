package com.sofkau.practica.numbers.utils;

import java.util.Scanner;

public class Input {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final Input INPUT = new Input();

    private Input() {
    }

    public static Input getInstance() {
        return INPUT;
    }

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
