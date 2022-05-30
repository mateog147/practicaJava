package com.sofkau.practica.person;

import com.sofkau.practica.person.utils.Persona;
import com.sofkau.practica.person.utils.Response;
import com.sofkau.practica.strings.utils.Input;
import com.sofkau.practica.strings.utils.Message;

import java.util.ArrayList;

/**
 * Clase App es el ejecutable para probar la clase Persona.
 * Usa las clases utilitarias Input y Message
 *
 * Se crean 3 instancias, cada una usa un metodo constructor diferente.
 * Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
 * el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto,
 * para este último utiliza los métodos set para darle a los atributos un valor.
 *
 * Para cada objeto imprime sus atributos un mensaje con su el rango del IMC.
 * Para cada objeto imprime si es mayor de edad o no.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @version 1.0.0 2022/05/30
 * @since 1.0.0
 */
public class App {


    public static void main(String[] args) {
        Input input = Input.getInstance();
        ArrayList<Persona> persons = new ArrayList<>();
        String name;
        Integer age;
        Character sex;
        Double weight;
        Double height;

        Message.print("Nombre:");
        name = input.line();
        Message.print("Edad:");
        age = input.number();
        Message.print("Sexo [H O M]:");
        sex = input.character();
        Message.print("Peso:");
        weight = input.decimal();
        Message.print("Altura:");
        height = input.decimal();

        persons.add(new Persona(name, age, sex, weight, height));
        persons.add(new Persona(name, age, sex));
        persons.add(new Persona());

        Message.print("Peso persona 2:");
        weight = input.decimal();
        persons.get(1).setPeso(weight);
        Message.print("Altura persona 2:");
        height = input.decimal();
        persons.get(1).setAltura(height);


        Message.print("Nombre Persona 3:");
        persons.get(2).setNombre(input.line());
        Message.print("Edad Persona 3:");
        persons.get(2).setEdad(input.number());
        Message.print("Sexo Persona 3 [H O M]:");
        persons.get(2).setSexo(input.character());
        Message.print("Peso Persona 3:");
        persons.get(2).setPeso(input.decimal());
        Message.print("Altura Persona 3:");
        persons.get(2).setAltura(input.decimal());

        imprimirPersonas( persons);

    }

    private static void imprimirPersonas(ArrayList<Persona> personas){
        for (Persona person:
                personas) {
            Message.print(person.toString());
            Message.print(imprimirIMC(person.calcularIMC()));
            Message.print(Boolean.TRUE.equals(person.esMayorDeEdad())?"Es Mayor de edad":"Es menor de Edad");
        }
    }

    private static String imprimirIMC(Integer index){
        Response response = Response.getInstance();

        switch (index){
            case -1 -> response.setStrResponse("Está por debajo de su peso ideal");
            case 0  -> response.setStrResponse("Está en su peso ideal") ;
            case 1  -> response.setStrResponse("Tiene sobrepeso") ;
            default -> response.setStrResponse("IMC fuera de Rango") ;
        }
        return response.getStrResponse();
    }

}
