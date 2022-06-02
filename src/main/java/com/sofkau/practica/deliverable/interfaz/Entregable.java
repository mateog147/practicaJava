package com.sofkau.practica.deliverable.interfaz;

public interface Entregable {
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
      Integer compareTo (Object a);
}
