package org.example.Calculadora;

import java.util.Scanner;

public class calculador {

    Scanner scanner = new Scanner(System.in);
        int a,b;
    public  int soma (){

        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        return a + b;
    }

    public  int subtracao (){

        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();
                return a - b;
    }

    public  int multiplicao (){

        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        return a * b;
    }

    public  int divisao (){

        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        return a / b;
    }
}
