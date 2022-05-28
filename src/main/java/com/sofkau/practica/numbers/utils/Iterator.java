package com.sofkau.practica.numbers.utils;

/**
 * Clase iterador
 *
 * Imprime los numeros pares de 1 al 100 y
 * los numeros impares del 1 al 100 incluidos.
 *
 * Resuelve ambas cosas usando un metodo while o for.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/28
 * @since 1.0.0
 */
public class Iterator {
    /**
     * Unica instancia de clase.
     */
    private static final Iterator ITERATOR = new Iterator();

    private Iterator() {
    }

    /**
     * regresa la unica instancia de clase.
     * @return  Iterator
     */
    public static Iterator getInstance() {
        return ITERATOR;
    }

    /**
     * Imprime los numeros pares de 1 al 100 usando un ciclo while
     */
    public void whileOdd(){
        whileIterator(true);
    }

    /**
     * Imprime los numeros imparespares de 1 al 100 usando un ciclo while
     */
    public void whileEven(){
        whileIterator(false);
    }

    /**
     * Imprime los numeros pares de 1 al 100 usando un ciclo for
     */
    public void forOdd(){
        forIterator(true);
    }


    /**
     * Imprime los numeros imparespares de 1 al 100 usando un ciclo for
     */
    public void forEven(){
        forIterator(false);
    }

    private void whileIterator(Boolean flag){
        int iterator = 1;
        while(iterator <= 100){
            printIf(iterator, flag);
            iterator++;
        }
    }

    private void forIterator(Boolean flag){
        for(int iterator =1;iterator <= 100; iterator++){
            printIf(iterator, flag);
        }
    }

    private void printIf(int number, Boolean flag){
        if(flag.equals(number % 2 == 0)){
            Message.print(Integer.toString(number));
        }
    }
}
