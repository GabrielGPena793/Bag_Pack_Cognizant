package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor:");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scanner.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        Double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);

    }

    public static int somar(int a, int b){
        return a + b ;
    }
    public static int subtrair(int a, int b){
        return a - b ;
    }

    public static Double dividir(int a, int b){
        return  (double) a / b ;
    }

    public static int multiplicar(int a, int b){
        return a * b ;
    }
}
