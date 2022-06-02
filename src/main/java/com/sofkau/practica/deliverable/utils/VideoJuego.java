package com.sofkau.practica.deliverable.utils;

import com.sofkau.practica.deliverable.interfaz.Entregable;

/**
 *Clase VideoJuego,
 * Implementa Entregable
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/02
 * @since 1.0.0
 */
public class VideoJuego  implements Entregable<VideoJuego> {
    private String titulo;
    private Integer horas;
    private Boolean entregado;
    private String genero;
    private String empresa;

    /**
     * Constructor Por defecto.
     * Asigna valores por defecto a la instancia.
     *
     */
    public VideoJuego() {
        this.titulo = "";
        this.horas = 10;
        this.entregado = false;
        this.empresa = "";
        this.genero = "";
    }
    /**
     * Constructor con dos atributos.
     * Los otros atributos se asignan por defecto.
     * @param titulo
     * @param horas
     */
    public VideoJuego(String titulo, Integer horas) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.empresa = "";
        this.genero = "";
    }
    /**
     * Constructor completo.
     * El atributo entregado se asigna por defecto false.
     * @param titulo
     * @param horas
     * @param genero
     * @param empresa
     */
    public VideoJuego(String titulo, Integer horas, String genero, String empresa) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.genero = genero;
        this.empresa = empresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nHoras estimadas: " + horas + "\nGenero:" + genero + "\nCompañia:" + empresa;
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
    public Integer compareTo(VideoJuego oj) {
        if(oj.getHoras() >= this.getHoras()){
            return 1;
        }
        return 0;
    }


}
