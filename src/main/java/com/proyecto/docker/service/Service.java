package com.proyecto.docker.service;

@org.springframework.stereotype.Service
public class Service {

    public String procesarParametro(String parametro){
        if (parametro.equals("ABC")){
            return "123";
        } else {
            return "Parámetro no válido.";
        }
    }

    public String saludar(String nombre){
        return "¡Hola " + nombre + "!";
    }

    public Double sumar(Double numero1, Double numero2){
        return numero1 + numero2;
    }

}
