package com.company.LoopsExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParImpa {
//    Faça um programa que peça N números inteiros.
//    Calcule e mostre a quantidade de números pares e a quantidade de números impares.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> par = new ArrayList<>();
        List<Integer> impa = new ArrayList<>();
        int decisao;

        do {
            System.out.println("Digite um número");
            int numero = scanner.nextInt();

            if (numero % 2 == 0)
                par.add(numero);
            else
                impa.add(numero);

            System.out.println("""
                    Deseja inserir outro número
                    1 - sim
                    2 - não
                    """);
            decisao = scanner.nextInt();

        }while (decisao != 2);

        System.out.println("Quantidade de números Pares: " + par.size() );
        System.out.println("Quantidade de números Impares: " + impa.size() );
    }
}
