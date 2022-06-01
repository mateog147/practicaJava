package com.sofkau.practica.appliances.utils;

import java.util.ArrayList;
import java.util.Locale;

public class Electrodomestico {
    private static  final Recargo RECARGO = Recargo.getInstance();
    private Integer precioBase;
    private String color;
    private Character consumoEnergetico;
    private Integer peso;


    public Electrodomestico() {
        this.precioBase = Constantes.PRICEDEFAULT;
        this.color = Constantes.COLORDEFAULT;
        this.consumoEnergetico = Constantes.CONSUMEDEFAULT;
        this.peso = Constantes.WEIGHTDEFAULT;
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.color = Constantes.COLORDEFAULT;
        this.consumoEnergetico = Constantes.CONSUMEDEFAULT;
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

        return RECARGO.cargoConsumo(this.consumoEnergetico);

    }

    private Integer cargoPeso(){
        Integer price;
        switch (RECARGO.determinarRango(this.peso)){
            case 19 -> price = 10;
            case 49 -> price = 50;
            case 79 -> price = 80;
            case 80 -> price = 100;
            default -> price = 0;
        }
        return  price;
    }


    private Character comprobarConsumoEnergetico(Character ch){
        if(Constantes.CONSUMECODES.contains(ch)){
            return ch;
        }
        return Constantes.CONSUMEDEFAULT;
    }

    private String comprobarColor(String color){
        if(Constantes.POSIBLECOLORS.contains(color)){
            return color;
        }
        return Constantes.COLORDEFAULT;
    }

}
