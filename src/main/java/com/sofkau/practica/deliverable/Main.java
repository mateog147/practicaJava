package com.sofkau.practica.deliverable;

import com.sofkau.practica.deliverable.utils.Serie;
import com.sofkau.practica.deliverable.utils.VideoJuego;
import com.sofkau.practica.strings.utils.Message;

import java.util.ArrayList;

/**
 * Clase ejecutable.
 * Crea dos arreglos uno de series y otro de juegos.
 * Los pobla.
 * Hacer un prueba de entregar y devolver.
 * Luego imprime la serie con más temporadas y el juego con más horas estimadas.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/06/02
 * @since 1.0.0
 */
public class Main {

    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Serie> series = new ArrayList<>();
        ArrayList<VideoJuego>  games= new ArrayList<>();

        fillSeries(series);
        fillGames(games);

        series.get(0).entregar();
        series.get(2).entregar();
        games.get(1).entregar();
        games.get(3).entregar();

        Integer seriesCounter = countDeliverySeries(series);
        Integer gamesCounter = countDeliveryGames(games);

        Message.print(Integer.toString(seriesCounter));
        Message.print(Integer.toString(gamesCounter));

        showMoreSeason(series);
        showMoreHours(games);
    }

    /**
     * Metodo para poblar un arreglo con Series
     * @param array ArrayList
     */
    private static void fillSeries(ArrayList<Serie> array){

        Serie s1 = new Serie("Serie por defecto", "Director");
        Serie s2 = new Serie("Juego de tronos",8,"Fantasía","David Benioff");
        Serie s3 = new Serie("Mr Robot",4,"Techno thriller", "Sam Esmail");
        Serie s4 = new Serie("Serie por defecto", "Director");
        Serie s5 = new Serie();

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);


    }

    /**
     * Metodo para poblar un arreglo con VideoJuegos
     * @param array ArrayList
     */
    private static void fillGames(ArrayList<VideoJuego> array){

        VideoJuego g1 = new VideoJuego("Super Mario Bross", 2);
        VideoJuego g2 = new VideoJuego("God of War", 22,"Acción-Aventura", "SCE Sanat Monica Estudio");
        VideoJuego g3 = new VideoJuego("Juego por defecto", 4);
        VideoJuego g4 = new VideoJuego();
        VideoJuego g5 = new VideoJuego();

        array.add(g1);
        array.add(g2);
        array.add(g3);
        array.add(g4);
        array.add(g5);
    }

    /**
     * Cuenta la cantidad de instancias entregadas y las devuelve.
     * @param series ArrayList
     * @return Integer con la cantidad de Instancia que estaban Entregadas.
     */
    private static Integer countDeliverySeries(ArrayList<Serie> series){
        Integer counter = 0;
        for(int i = 0; i<5; i++){
            if(Boolean.TRUE.equals(series.get(i).isEntregado()) ){
                counter++;
                series.get(i).devolver();
            }
        }
        return counter;
    }
    /**
     * Cuenta la cantidad de instancias entregadas y las devuelve.
     * @param games ArrayList
     * @return Integer con la cantidad de Instancia que estaban Entregadas.
     */
    private static Integer countDeliveryGames(ArrayList<VideoJuego> games){
        Integer counter = 0;
        for(int i = 0; i<5; i++){
            if(Boolean.TRUE.equals(games.get(i).isEntregado()) ){
                counter++;
                games.get(i).devolver();
            }
        }
        return counter;
    }

    /**
     * Imprime en pantalla la serie con más temporadas de un Array pasado por parametro.
     * usa la clase utilitaria Message
     * @param series ArrayList
     */
    private static void showMoreSeason(ArrayList<Serie> series){
        Serie temp = series.get(0);
        for (Serie element: series) {
            if(temp.getTemporadas()<=element.getTemporadas()){
                temp = element;
            }
        }

        Message.print("La Serie con más temporadas es:");
        Message.print(temp.toString());
    }

    /**
     * Imprime en pantalla el juego con más horas estimadas de un Array pasado por parametro.
     * usa la clase utilitaria Message.
     * @param games ArrayList
     */
    private static void showMoreHours(ArrayList<VideoJuego> games){
        VideoJuego temp = games.get(0);
        for (VideoJuego element: games) {
            if(temp.getHoras()<=element.getHoras()){
                temp = element;
            }
        }

        Message.print("El juego  con más horas estimadas es:");
        Message.print(temp.toString());
    }

}
