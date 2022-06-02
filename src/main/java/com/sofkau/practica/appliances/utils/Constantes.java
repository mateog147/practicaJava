package com.sofkau.practica.appliances.utils;

import java.util.HashSet;
import java.util.List;

/**
 * Clase utilitaria que contiene las costantes por default de los atributos.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/01
 * @since 1.0.0
 */
public class Constantes {

    private Constantes() {
    }

    /**
     *Precio por defectos en euros
     */
    protected static final Double PRICEDEFAULT = 100.0;
    /**
     *Color por defecto
     */
    protected static final String COLORDEFAULT = "blanco";
    /**
     *Peso por defecto en Kg
     */
    protected static final Integer WEIGHTDEFAULT = 5;
    /**
     *Codigo de consumo por defecto
     */
    protected static final Character CONSUMEDEFAULT = 'F';
    /**
     *Listado de posibles codigo de consumo
     */
    protected static final Character[] CODES = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected static final HashSet<Character> CONSUMECODES = new HashSet<>(List.of(CODES));
    /**
     *Listado de posibles colores
     */
    protected static final String[] COLORS = {COLORDEFAULT, "negro", "rojo", "azul", "gris"};
    protected static final HashSet<String> POSIBLECOLORS = new HashSet<>(List.of(COLORS));
    /**
     * Carga por defecto de la lavadora en Kg
     */
    protected static final Integer CARGADEFAULT = 5;
    /**
     *Resolucion por defecto de los telivores en Pulgadas
     */
    protected static final Integer INCHDEFAULT = 20;
    /**
     * Condiciones boleana que por defecto de los telivisores.
     */
    protected static final Boolean TDTDEFAULT = false;

}
