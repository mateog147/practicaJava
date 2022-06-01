package com.sofkau.practica.appliances.utils;

import java.util.HashSet;
import java.util.List;

public class Constantes {

    private Constantes() {
    }

    protected static final Integer PRICEDEFAULT = 100;
    protected static final String COLORDEFAULT = "blanco";
    protected static final Integer WEIGHTDEFAULT = 5;
    protected static final Character CONSUMEDEFAULT = 'F';
    protected static final Character[] CODES = {'A', 'B', 'C', 'D', 'E', 'F'};
    protected static final HashSet<Character> CONSUMECODES = new HashSet<>(List.of(CODES));
    protected static final String[] COLORS = {COLORDEFAULT, "negro", "rojo", "azul", "gris"};
    protected static final HashSet<String> POSIBLECOLORS = new HashSet<>(List.of(COLORS));
}
