package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String texto = calculadora.holaMundo();
        System.out.println(texto);

        Calculadora calculadora1 = (Calculadora) context.getBean("calculadora");

        String texto1 = calculadora1.holaMundo();
        System.out.println(texto1);

        // Ejemplo 2
        // Cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

        // Ejemplo 3
        // los beans por defecto son singleton, se crea el objeto y se reutiliza para toda la aplicación
        // podemos cambiarlo a scope="prototype" si queremos que se cree un nuevo objeto cada vez

    }
}
