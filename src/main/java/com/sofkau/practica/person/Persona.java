package com.sofkau.practica.person;

import java.util.Random;

/**
 *Clase Persona.
 *
 *Clase con atributos nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
 * Que re presentan la información basica de una persona.
 *
 * Los metodos disponibles son: calcularIMC, esMayorDeEdad, toString y setters.
 * Tiene 3 metodos constructores.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class Persona {
    /**
     * Constantes tipo caracter para l atributo sexo.
     */
    private static final Character  HOMBRE = 'H';
    private static final Character  MUJER = 'M';
    /**
     * Variables indicando el estatus del rango del IMC
     * IMC menor que 20 : -1,
     * IMC entre 20 y 25: 0
     * IMC mayor que 25: 1
     */
    private static final Integer    IMCIDEAL= 0;
    private static final Integer    IMCBAJO = -1;
    private static final Integer    IMCALTO = 1;
    /**
     * Instancia de la clase Random para generar valores aleatorios
     */
    private Random random = new Random();

    private String nombre;
    private Integer edad;
    private String dni;
    private Character sexo;
    private Double peso;
    private Double altura;

    /**
     * Constructor por defecto.
     * Asigna valores por defecto a los atributos.
     * El atributo  DNI es aleatorio.
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
        this.dni = generarDNI();
    }

    /**
     * Constructor con 3 parametros.
     * los atributos de peso y altura se asignan por defecto [0.0]
     * El atributo  DNI es aleatorio.
     * Si el parametro suministrado para sexo no es valido se asigna por defecto 'H'
     *
     * @param nombre String
     * @param edad Integer
     * @param sexo Character [H o M]
     */
    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 0.0;
        this.altura = 0.0;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
    }

    /**
     * Constructor con atributos.
     *
     * El atributo  DNI es aleatorio.
     * Si el parametro suministrado para sexo no es valido se asigna por defecto 'H'
     *
     * @param nombre String
     * @param edad Integer
     * @param sexo Character [H o M]
     * @param peso Double peso en Kg
     * @param altura Double altura en metros
     */
    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * Si el valor suministrado no es valido le asiganara un valor por defecto.
     * @param sexo Character
     */
    public void setSexo(Character sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * Retorna el un entero que muestra el intervalo del Indice de Masa Corporal (IMC)
     *
     * IMC menor que 20 : -1,
     * IMC entre 20 y 25: 0
     * IMC mayor que 25: 1
     *
     * @return Integer
     */
    public Integer calcularIMC(){
        Double imc =numeroImc();

        if(imc<20){
            return IMCBAJO;
        }

        if(imc > 25){
            return IMCALTO;
        }

        return IMCIDEAL;
    }

    /**
     * Retorna true si tiene 18 años o más
     * @return Boolean
     */
    public Boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    /**
     * Retorna un mensaje con los atributos de la instancia.
     * @return String
     */
    @Override
    public String toString() {
        return "\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nSexo: " + this.sexo + "\nDNI:" +this.dni + "\nPeso:" +this.peso+"\nAltura:" +this.altura;
    }

    private Character comprobarSexo(Character sexo){
        if(sexo.equals(HOMBRE) || sexo.equals(MUJER) ){
            return sexo;
        }
        return   HOMBRE;

    }


    private String generarDNI(){


        StringBuilder builder = new StringBuilder();
        for(int i=0; i<=7; i++){
            builder.append(random.nextInt(9));
        }
        return builder.toString();
    }

    private Double numeroImc(){
        if(this.altura == 0){
            return 0.0;
        }
        return  this.peso/Math.pow(this.altura,2);
    }
}
