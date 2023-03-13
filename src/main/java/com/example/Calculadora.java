package com.example;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Calculadora() {
        System.out.println("Ejecutando calculator service");
    }
    public String holaMundo(){
        return "Hola mundo!";
    }
}
