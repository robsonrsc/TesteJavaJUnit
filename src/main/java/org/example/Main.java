package org.example;

import org.example.Calculadora.calculador;

public class Main {
    public static void main(String[] args) {

        calculador calc = new calculador();
        int soma = calc.soma();
        System.out.println(soma);

    }
}