package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scarnner(System.in);

        int a, b;

        System.out.println("Digite o primeiro Valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo Valor:");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrai = subtrai(a, b);
        int multipica = multipica(a, b);
        int divide = divide(a, b);

        System.out.println("Somar"+ soma);
        System.out.println("Subtrair"+ subtrai);
        System.out.println("Multiplicar"+ multipica);
        System.out.println("Dividir"+ divide);
    }

    public static int soma (int a, int b){
        return a + b;
    }

    public static int subtrai (int a, int b){
        return a - b;
    }

    public static int multipica (int a, int b){
        return a * b;
    }

    public static int divide (int a, int b){
        return a / b;
    }
}
