package com.proyecto.docker.controller;

import com.proyecto.docker.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Service miServicio;

    @GetMapping("/inicio")
    public String saludo() {
        return "Bienvenidos";
    }

    @GetMapping("/mi-endpoint")
    public String miEndpoint(@RequestParam String parametro) {
        return miServicio.procesarParametro(parametro);
    }

    @GetMapping("saludo-personalizado")
    public String saludoPersonalizado(@RequestParam String nombre){
        return miServicio.saludar(nombre);
    }

    @GetMapping("/suma")
    public Double suma(@RequestParam Double numero1, @RequestParam Double numero2) {
        return miServicio.sumar(numero1, numero2);
    }

}
