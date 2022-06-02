package com.sofkau.practica.deliverable.utils;

import com.sofkau.practica.deliverable.interfaz.Entregable;

/**
 *Clase Serie, representa una serie Audio Visual.
 * Implementa la interface Entregable
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/02
 * @since 1.0.0
 */
public class Serie implements Entregable {

    private String titulo;
    private Integer temporadas;
    private Boolean entregado;
    private String genero;
    private String creador;

    /**
     * Constructor Por defecto.
     * Asigna valores por defecto a la instancia.
     *
     */
    public Serie() {
        this.titulo = "";
        this.temporadas = 3;
        this.entregado = false;
        this.creador = "";
        this.genero = "";
    }

    /**
     * Constructor con dos atributos.
     * Los otros atributos se asignan por defecto.
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.temporadas = 3;
        this.entregado = false;
        this.creador = creador;
        this.genero = "";
    }

    /**
     * Constructor completo.
     * El atributo entregado se asigna por defecto false.
     * @param titulo
     * @param temporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, Integer temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nTemporada: " + temporadas + "\nGenero:" + genero + "\nCreador:" + creador;

    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Integer compareTo(Object a) {
        return null;
    }
}
