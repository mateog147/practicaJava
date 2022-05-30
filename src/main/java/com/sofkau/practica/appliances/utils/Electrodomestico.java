package com.sofkau.practica.appliances.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class Electrodomestico {
    private final Integer PRICEDEFAULT = 100;
    private final String COLORDEFAULT = "blanco";
    private final Integer WEIGHTDEFAULT = 5;
    private final Character CONSUMEDEFAULT = 'F';

    private final Character[] CODES = {'A', 'B', 'C', 'D', 'E', 'F'};
    private final HashSet<Character> CONSUMECODES = new HashSet<Character>(List.of(CODES));
    private final String[] COLORS = {"blanco", "negro", "rojo", "azul", "gris"};
    private final HashSet<String> POSIBLECOLORS = new HashSet<String>(List.of(COLORS));


    private Integer precioBase;
    private String color;
    private Character consumoEnergetico;
    private Integer peso;

    public Electrodomestico() {
        this.precioBase = PRICEDEFAULT;
        this.color = COLORDEFAULT;
        this.consumoEnergetico = CONSUMEDEFAULT;
        this.peso = WEIGHTDEFAULT;
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.color = COLORDEFAULT;
        this.consumoEnergetico = CONSUMEDEFAULT;
        this.peso = peso;
    }

    public Electrodomestico(Integer precioBase, String color, Character consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color.toLowerCase(Locale.ROOT)) ;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico) ;
        this.peso = peso;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer precioFinal(){
        Integer precioFinal = this.precioBase;
        precioFinal += cargoConsumo();
        precioFinal += cargoPeso();

        return precioFinal;
    }

    private Integer cargoConsumo(){

        switch (this.consumoEnergetico){
            case 'A' -> {
                return 100;
            }
            case 'B' -> {
                return  80;
            }
            case 'C' -> {
                return  60;
            }
            case 'D' -> {
                return  50;
            }
            case 'E' -> {
                return  30;
            }
            case 'F' -> {
                return  10;
            }
            default -> {
                return 0;
            }
        }

    }

    private Integer cargoPeso(){
        Integer price;
        switch (determinarRango()){
            case 19 -> price = 10;
            case 49 -> price = 50;
            case 79 -> price = 80;
            case 80 -> price = 100;
            default -> price = 0;
        }
        return  price;
    }

    private Integer determinarRango(){
        ArrayList<Integer> limites = new ArrayList<Integer>();
        limites.add(19);
        limites.add(49);
        limites.add(79);

        for (Integer limite:limites) {
            if(this.peso - limite <= 0){
                return limite;
            }
        }

        return 80;
    }

    private Character comprobarConsumoEnergetico(Character ch){
        if(CONSUMECODES.contains(ch)){
            return ch;
        }
        return CONSUMEDEFAULT;
    }

    private String comprobarColor(String color){
        if(POSIBLECOLORS.contains(color)){
            return color;
        }
        return COLORDEFAULT;
    }

}
