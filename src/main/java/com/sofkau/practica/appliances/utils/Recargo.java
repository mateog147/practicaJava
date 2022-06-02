package com.sofkau.practica.appliances.utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase recargo.
 *
 * Funciona como abstraccion para sumar los valores adicionales a los electrodomesticos.
 * Y calcular el precio final.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/01
 * @since 1.0.0
 */
public class Recargo {
    /**
     * Instancia unica de la clase.
     */
    private static final Recargo INSTANCE = new Recargo();
    /**
     * ArrayList de integer con los limites de peso para recargo.
     * 0 - 19
     * 20 - 49
     * 50 - 79
     *
     */
    private  ArrayList<Integer> limites;
    /**
     * HashMap que relaciona los codigos de consumo con el recargo.
     * A -> 100
     * B -> 80
     * C -> 60
     * D -> 50
     * E -> 30
     * F -> 10
     */
    private   HashMap<Character, Double> consumos;

    /**
     * Metodo constructor privado, alimenta las colecciones de datos.
     */
    private Recargo(){
        limites = new ArrayList<>();
        consumos = new HashMap<>();
        limites.add(19);
        limites.add(49);
        limites.add(79);
        consumos.put('A',100.0);
        consumos.put('B',80.0);
        consumos.put('C',60.0);
        consumos.put('D',50.0);
        consumos.put('E',30.0);
        consumos.put('F',10.0);

    }

    /**
     * Metodo que retorna la instancia de clase
     * @return Recargo
     */
    public static Recargo getInstance(){
        return INSTANCE;
    }

    /**
     *
     * @param peso Peso en Kg en del electrodomisco.
     * @return Integer con el el limite del rango en el que se encuentra.
     * 0-19 -> 19
     * 20 - 49 -> 49
     * 50 - 79 - > 79
     * +80 - > 80
     */
    public Integer determinarRango(Integer peso){

        for (Integer limite:limites) {
            if(diferenciaPeso(limite, peso)){
                return  limite;
            }
        }
        return 80;
    }

    /**
     *Metodo para calcular el sobre costo por codigo de consumo.
     * @param codigo Character codigo consumo
     * @return Double Costo adicional
     */
    public Double cargoConsumo(Character codigo){
            if(consumos.containsKey(codigo)){
                return consumos.get(codigo);
            }
            return 0.0;

    }

    /**
     * metodo para calcular el excedente segun el tamaño de la pantalla.
     * @param res Integer resolucion en pulgadas
     * @param price Double precio base
     * @return Double precio modificado
     */
    public  Double cargoResolucion(Integer res, Double price){
        if(res>40){
            return price * 0.3;
        }

    return 0.0;
    }

    /**
     * Metodo para calcular el precio adicional por Tdt.
     * @param tdt Boolean del TDT
     * @return Double Monto a sumar al precio.
     */
    public Double cargoTDT(Boolean tdt){
        return Boolean.TRUE.equals(tdt ) ? 50.0 : 0;
    }


    private boolean diferenciaPeso(Integer a, Integer b){
            return  b - a <= 0;
    }



}
