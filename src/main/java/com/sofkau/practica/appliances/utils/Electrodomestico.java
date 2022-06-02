package com.sofkau.practica.appliances.utils;


import java.util.Locale;

/**
 *Clase Electrodomestico.
 * 3 constructores.
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/01
 * @since 1.0.0
 */
public class Electrodomestico {
    /**
     * Instancia de la clase recargo
     */
    private static  final Recargo RECARGO = Recargo.getInstance();
    /**
     * Precio sin recargos
     */
    private Double precioBase;
    /**
     *Color del aparato
     */
    private String color;
    /**
     * Codigo del consumo energetico.
     * Es una letra entre la A y la F
     */
    private Character consumoEnergetico;
    /**
     * Peso en Kg sin decimales
     */
    private Integer peso;


    /**
     * Constructor por defecto,
     * usa valores predeterminados por defecto para los atributos.
     */
    public Electrodomestico() {
        this.precioBase = Constantes.PRICEDEFAULT;
        this.color = Constantes.COLORDEFAULT;
        this.consumoEnergetico = Constantes.CONSUMEDEFAULT;
        this.peso = Constantes.WEIGHTDEFAULT;
    }

    /**
     * Metodo constructor con dos parametros.
     * Los demas atributos los asigna por defectos.
     * Toma dos parametros
     * @param precioBase Double
     * @param peso Integer
     */
    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.color = Constantes.COLORDEFAULT;
        this.consumoEnergetico = Constantes.CONSUMEDEFAULT;
        this.peso = peso;
    }

    /**
     * Constructor completo.
     * Se valida que el color sea valido, si no lo es se asigna el valor por defecto.
     * Se valida que el  caracter del codigo de consumo.
     * Si no es valido se asigna el valor por defecto.
     * @param precioBase Integer
     * @param color String
     * @param consumoEnergetico Character
     * @param peso Integer
     */
    public Electrodomestico(Double precioBase, String color, Character consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color.toLowerCase(Locale.ROOT)) ;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico) ;
        this.peso = peso;
    }

    public Double getPrecioBase() {
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

    /**
     * Metodo que calcula el precio final.
     * Le suma los recargos al precio base
     * @return Double
     */
    public Double precioFinal(){
        Double precioFinal = this.precioBase;
        precioFinal += cargoConsumo();
        precioFinal += cargoPeso();

        return precioFinal;
    }

    private Double cargoConsumo(){

        return RECARGO.cargoConsumo(this.consumoEnergetico);

    }

    private Integer cargoPeso(){
        Response response = Response.getInstance();
        switch (RECARGO.determinarRango(this.peso)){
            case 19 -> response.setIntResponse(10);
            case 49 -> response.setIntResponse(50);
            case 79 -> response.setIntResponse(80);
            case 80 -> response.setIntResponse(100);
            default -> response.setIntResponse(0);
        }
        return  response.getIntResponse();
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
