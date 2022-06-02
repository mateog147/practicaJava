package com.sofkau.practica.deliverable.interfaz;

import com.sofkau.practica.deliverable.utils.VideoJuego;

public interface Entregable <T>{
    /**
     * Cambia el atributo prestado a true
     */
    void entregar();

    /**
     * cambia el atributo prestado a false.
     */
    void devolver();
    /**
     *devuelve el estado del atributo prestado.
     */
    Boolean isEntregado();
    /**
     * compara las horas estimadas en los videojuegos y en las series el numero de temporadas
     */
      Integer compareTo (T object);
}
