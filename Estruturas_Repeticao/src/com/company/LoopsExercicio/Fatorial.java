package com.company.LoopsExercicio;

import java.util.Scanner;

public class Fatorial {

//    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//    Ex.: 5 != 5.4.3.2.1 = 120

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        for (int i = numero-1; i >= 1; i--){
            numero *= i;
        }

        System.out.println("A fatoração do número é: " + numero);
    }
}
