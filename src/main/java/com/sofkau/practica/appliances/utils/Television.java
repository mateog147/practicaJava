package com.sofkau.practica.appliances.utils;

/**
 * Clase televisión.
 * Extiende la clase electrodomestico.
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/01
 * @since 1.0.0
 */

public class Television extends Electrodomestico{
    /**
     * Resolucion de la pantalla en pulgadas
     */
    private Integer resolucion;
    /**
     * Valor boleano que determina si tiene tdt
     */
    private Boolean tdt;

    /**
     * Constructor por defecto.
     * asigna valores por defecto a los atributos.
     */
    public Television() {
        super();
        this.resolucion = Constantes.INCHDEFAULT ;
        this.tdt = Constantes.TDTDEFAULT;
    }
    /**
     * Constructor con dos valores.
     * Los demas atribubutos son asiganados por defecto.
     * @param precioBase Double
     * @param peso Integer
     */
    public Television(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.resolucion = Constantes.INCHDEFAULT ;
        this.tdt = Constantes.TDTDEFAULT;
    }

    /**
     *Constructor completo
     * @param precioBase Double
     * @param color String
     * @param consumoEnergetico Character
     * @param peso Integer
     * @param resolucion Integer
     * @param tdt Boolean
     */
    public Television(Double precioBase, String color, Character consumoEnergetico, Integer peso, Integer resolucion, Boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    /**
     * Sobre escribe el metodo precio  final.
     * Le suma el valor dependiendo de la resolucion y si tiene tdt
     * @return Double
     */
    @Override
    public Double precioFinal(){
        Double price = super.precioFinal();
        price += Recargo.getInstance().cargoTDT(this.tdt);
        price += Recargo.getInstance().cargoResolucion(this.resolucion, this.getPrecioBase());
        return price;
    }

}
