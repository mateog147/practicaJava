package com.sofkau.practica.appliances.utils;

public class Response {
    /**
     * Atributo para responder mensajes en String
     */
    private String strResponse;
    /**
     * Atributo para manjear respuestas Integer
     */
    private Integer intResponse;

    private  static final Response  INSTANCE = new Response();

    private Response() {
    }

    /**
     * Metodo para retornar la instancia de clase
     * @return Response
     */
    public static Response getInstance(){
        return INSTANCE;
    }

    public String getStrResponse() {
        return strResponse;
    }

    public void setStrResponse(String strResponse) {
        this.strResponse = strResponse;
    }

    public Integer getIntResponse() {
        return intResponse;
    }

    public void setIntResponse(Integer intResponse) {
        this.intResponse = intResponse;
    }
}
