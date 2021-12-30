package com.company.ArraysExercicio;

import java.util.Random;

public class NumerosAleatorios {

 /*   Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
    armazene-os num vetor. Ao final, mostre os números e seus sucessores.*/

    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int[] numerosAleatorios = new int[20];

        do {
            int numeroRadom = random.nextInt(100);
            numerosAleatorios[count] = numeroRadom;
            count++;

        }while (count < numerosAleatorios.length);

        System.out.print("Números do array: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nNúmeros sucessores do array: " );
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }



    }
}
