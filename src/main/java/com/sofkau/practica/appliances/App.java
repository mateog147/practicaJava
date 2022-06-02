package com.sofkau.practica.appliances;

import com.sofkau.practica.appliances.utils.Electrodomestico;
import com.sofkau.practica.appliances.utils.Lavadora;
import com.sofkau.practica.appliances.utils.Television;
import com.sofkau.practica.strings.utils.Message;

import java.util.ArrayList;

/**
 * Clase ejecutable para probar la clases relacionadas con electrodomesticos.
 *
 * Instancia un arreglo de 10 posiciones.
 * 4 Lavadora.
 * 3 Televisores.
 * 3 Electrodomesticos genericos.
 *
 * Recorre el arreeglo y suma los precios totales.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/01
 * @since 1.0.0
 */
public class App {
    /**
     *metodo ejecutable.
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> array = new ArrayList<>();
        fillArray(array);
        Double totalPrice = 0.0;
        Double tvPrice = 0.0;
        Double lavPrice =0.0;
        for(Electrodomestico element: array){
            totalPrice += element.precioFinal();
            if(element instanceof Television){
                tvPrice += element.precioFinal();
            }
            if(element instanceof Lavadora){
                lavPrice += element.precioFinal();
            }
        }
        showResults(totalPrice,tvPrice,lavPrice);

    }

    /**
     *Metodo para llenar el array con 10 objetos
     * @param array ArrayList de Electrodomenticos
     */
    private  static void fillArray(ArrayList<Electrodomestico> array){
        /*Creo los elementos y los agrego*/
        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(530.0, 102);
        Lavadora lav3 = new Lavadora(85.7,"negro",'E',50,8);
        Lavadora lav4 = new Lavadora(100.0,"azul",'A',45,5);

        Television tv1 = new Television();
        Television tv2 = new Television(120.0,3);
        Television tv3 = new Television(200.0,"negro",'B',6,50,true);

        Electrodomestico ele1 = new Electrodomestico();
        Electrodomestico ele2 = new Electrodomestico();
        Electrodomestico ele3 = new Electrodomestico();

        array.add(tv1);
        array.add(tv2);
        array.add(tv3);
        array.add(lav1);
        array.add(lav2);
        array.add(lav3);
        array.add(lav4);
        array.add(ele1);
        array.add(ele2);
        array.add(ele3);
    }

    /**
     * Metodo para iprimir los resultados.
     * Usa la clase utilitaria Message
     * @param total Double con el costo total
     * @param tv Double con el costo de los telivisores
     * @param laundry Double con el costo de las lavadoras.
     */
    private  static void showResults(Double total, Double tv, Double laundry){
            Message.print("Costo total:");
            Message.print(Double.toString(total));
            Message.print("Costo televisores:");
            Message.print(Double.toString(tv));
            Message.print("Costo Lavadora:");
            Message.print(Double.toString(laundry));
    }
}
