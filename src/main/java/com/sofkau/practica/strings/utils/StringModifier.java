package com.sofkau.practica.strings.utils;

import java.util.Arrays;
import java.util.Locale;

/**
 * Clase para manipular cadenas de texto.
 *
 * Emplea un diseño sigletone por lo que siempre retorna una unica instancia
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/29
 * @since 1.0.0
 */
public class StringModifier {
    /**
     * Una instancia de clase
     */
    private static final StringModifier INSTANCE= new StringModifier();
    /**
     * Instancia de la clase input para recibir valores pr consola
     */
    private static final Input input = Input.getInstance();

    private StringModifier() {
    }

    /**
     * Metodo para obtener la instancia.
     * @return StringModifier
     */
    public static StringModifier getInstance(){
        return INSTANCE;
    }

    /**
     * Del texto, “La sonrisa sera la mejor arma contra la tristeza”
     * Reemplaza todas las a del String anterior por una e,
     * adicionalmente concatenar a esta frase una adicional que
     * ustedes quieran incluir por consola y las muestre luego unidas.
     */
    public void sentenceAdd(){
        String smile = "La sonrisa sera la mejor arma contra la tristeza";
        smile = smile.replace('a', 'e');
        String userString = stringInput();
        Message.print(smile +" "+ userString);
    }

    /**
     * Realizar una aplicación de consola, que al ingresar una frase por teclado
     * elimine los espacios que esta contenga.
     */
    public void deleteSpaces(){
        String userString = stringInput();
        String noSpaceString= userString.replace(" ", "");
        Message.print(noSpaceString);
    }

    /**
     * Realizar la construcción de un algoritmo que permita de acuerdo a una frase
     * pasada por consola, indicar cual es la longitud de esta frase, adicionalmente
     * cuantas vocales tiene de “a,e,i,o,u”.
     */
    public void countVowels(){
        String userString = stringInput();
        Message.print("La longitud de la frase es: " + Integer.toString(userString.length()));
        Integer vowels = vowelsOf(userString.toLowerCase(Locale.ROOT));
        Message.print("La frase tiene : " + Integer.toString(vowels) + " Vocales");
    }

    /**
     * 12.	Pedir dos palabras por teclado, indicar si son iguales,
     * si no son iguales mostrar sus diferencias.
     */
    public void spotDifferences(){
        String wordA = stringInput();
        String wordB = stringInput();

        if(wordA.equals(wordB)){
            Message.print("Las palabras son iguales");
        }else{
            Message.print("Diferencias: "+ getDifferences(wordA, wordB));
        }
    }


    private String stringInput(){
        Message.print("Ingrese una frase");
        return  input.line();
    }

    private Integer vowelsOf(String string){
        Integer counter = 0;

        for(char ch: string.toCharArray()){
            if(Boolean.TRUE.equals(isVowel(ch))) {
                counter++;
            }
        }
        return counter;
    }

    private Boolean isVowel(Character ch){
        Character[] vowels = {'a','e','i','o','u'};

        return Arrays.asList(vowels).contains(ch);
    }

    private String getDifferences(String a, String b){

        Integer limit = (a.length() >= b.length()) ? b.length() : a.length();
        return findDifferences(a,b,limit);
    }

    private String findDifferences(String a, String b, Integer limit){
        StringBuilder response = new StringBuilder();

        for(int i = 0; i<limit; i++){
            response.append(compareChar(a.charAt(i),b.charAt(i)));
        }
        return response.toString();
    }


    private Character compareChar(Character a, Character b){
        return (a.equals(b)) ? '_':a;
    }
}
