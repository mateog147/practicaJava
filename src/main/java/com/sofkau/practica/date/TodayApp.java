package com.sofkau.practica.date;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *Clase Today App
 *
 * Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 * Clase con un metodo main que te permite ver en consola la fecha y hora actual.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/29
 * @since 1.0.0
 */
public class TodayApp {
    private static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option;
        do{
            printDate();
            logger.info("Presione 's' para salir o culquier tecla para volver a consultar");
            option=scan.nextLine();
        }while(!option.equals("s"));
    }

    private static void printDate(){
        /*Capturo el date time actual*/
        LocalDateTime day =LocalDateTime.now();
        /*Seteo el formato*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd (HH:mm:ss)");
        /*Imprimo en consola*/
        String str = formatter.format(day);
        logger.info(str);
    }
}
