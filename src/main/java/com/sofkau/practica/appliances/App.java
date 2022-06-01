package com.sofkau.practica.appliances;

import com.sofkau.practica.appliances.utils.Electrodomestico;

public class App {
    public static void main(String[] args) {
        Electrodomestico licuadora = new Electrodomestico(20,"rojo",'A',4);
        System.out.println(licuadora.getColor());
        System.out.println(licuadora.precioFinal());
    }
}
