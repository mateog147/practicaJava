package com.sofkau.practica.appliances.utils;

/**
 * Clase lavadora.
 * Extiende la clase electrodomestico.
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/01
 * @since 1.0.0
 */
public class Lavadora extends Electrodomestico{
    /**
     * Capacidad de carga en Kg sin decimales
     */
    private Integer carga;

    /**
     * Constructor por defecto.
     * asigna valores por defecto a los atributos.
     */
    public Lavadora (){
        super();
        this.carga = Constantes.CARGADEFAULT;
    }

    /**
     * Constructor con dos valores.
     * Los demas atribubutos son asiganados por defecto.
     * @param precioBase Double
     * @param peso Integer
     */
    public Lavadora(Double precioBase, Integer peso){
        super();
        this.carga = Constantes.CARGADEFAULT;
    }

    /**
     * Constructor completo.
     *
     * @param precioBase Double
     * @param color String
     * @param consumoEnergetico Character
     * @param peso Integer
     * @param carga Integer
     */
    public  Lavadora(Double precioBase, String color, Character consumoEnergetico, Integer peso, Integer carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    /**
     * Sobre escribe el metodo precio  final.
     * Le suma el valor dependiendo de la carga
     * @return Double
     */
    @Override
    public Double precioFinal() {
        if(this.carga > 30 ){
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
