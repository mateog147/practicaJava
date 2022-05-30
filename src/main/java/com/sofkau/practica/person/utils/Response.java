package com.sofkau.practica.person.utils;

public class Response {

    private String strResponse;

    private  static final Response  INSTANCE = new Response();

    private Response() {
    }

    public static Response getInstance(){
        return INSTANCE;
    }

    public String getStrResponse() {
        return strResponse;
    }

    public void setStrResponse(String strResponse) {
        this.strResponse = strResponse;
    }
}
