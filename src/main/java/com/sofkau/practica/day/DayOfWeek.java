package com.sofkau.practica.day;


import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *Clase para ver si un día de la semana es la boral o no
 *
 * Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no.
 * Usa un switch para ello.
 *
 * Se usa un hashMap para validar y un Switch en la impresión en consola del resultado.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/28
 * @since 1.0.0
 */
public class DayOfWeek {
    /**
     * Map con los dias de la semana y un boolean si es laboral
     */
    static HashMap<String, Boolean> days = new HashMap<>();
    /**
     * Variable que ingresa el usuario
     */
    static String day;
    /**
     * Instancia de la clase Logger para imprimir en consola
     */
    static Logger logger = Logger.getLogger("logger");
    /**
     * Instancia de la clase Scanner para capturar variables.
     */
    static Scanner scan = new Scanner(System.in);

    /**
     * Metodo principal de clase
     */
    public static void main(String[] args) {
        setList();
        dayInput();
        verifyDay();
    }

    /**
     * Metodo para poblar el Map de días.
     */
    private static void setList(){
        days.put("lunes", true);
        days.put("martes", true);
        days.put("miercoles", true);
        days.put("jueves", true);
        days.put("viernes", true);
        days.put("sabado", false);
        days.put("domingo", false);
    }

    /**
     * Metodo para ingresa un valor por consola.
     * Pone la entrada en minusculas y elimina espacios al principio y final
     */
    private static void dayInput(){
        logger.info("Digite el día a consultar:");
        day = scan.nextLine().toLowerCase(Locale.ROOT);
        day =day.trim();
    }

    /**
     * Metodo para verificar si el día ingresado esta contenido en el Map
     */
    private static void verifyDay(){
        if(days.containsKey(day)){
            isWorkingDay();
        }else{
            logger.info("No es un día valido");
        }
    }

    /**
     *
     */
    private static void isWorkingDay(){
        if(Boolean.TRUE.equals(days.get(day))){
            switch (day){
                case "lunes"    ->logger.info("EL lunes es un día Laboral");
                case "martes"   ->logger.info("EL martes es un día Laboral");
                case "miercoles"->logger.info("EL miercoles es un día Laboral");
                case "jueves"   ->logger.info("EL jueves es un día Laboral");
                case "viernes"  ->logger.info("EL viernes es un día Laboral");
                default         -> logger.warning("error de ejecución");
            }

        }else{

            if(day.equals("sabado")){
                logger.info("EL sabado NO es un día Laboral :)");
            }else{
                logger.info("EL domingo NO es un día Laboral :)");
            }
        }
    }
}
