package com.sofkau.practica.appliances.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Recargo {
    private static final Recargo INSTANCE = new Recargo();
    private static ArrayList<Integer> limites;
    private static  HashMap<Character, Integer> CONSUMOS;
    private Recargo(){
        limites = new ArrayList<>();
        CONSUMOS = new HashMap<>();
        limites.add(19);
        limites.add(49);
        limites.add(79);
        CONSUMOS.put('A',100);
        CONSUMOS.put('B',80);
        CONSUMOS.put('C',60);
        CONSUMOS.put('D',50);
        CONSUMOS.put('E',30);
        CONSUMOS.put('F',10);

    }

    public static Recargo getInstance(){
        return INSTANCE;
    }

    public Integer determinarRango(Integer peso){

        for (Integer limite:limites) {
            if(diferenciaPeso(limite, peso)){
                return  limite;
            }
        }
        return 80;
    }

    public Integer cargoConsumo(Character codigo){
            if(CONSUMOS.containsKey(codigo)){
                return CONSUMOS.get(codigo);
            }
            return 0;

        }


        private boolean diferenciaPeso(Integer a, Integer b){
        boolean flag = b - a <= 0;
        return flag;
    }



}
