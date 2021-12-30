package com.company.ArraysExercicio;

public class Inverso {
//    Faça um Programa que leia um vetor de 6 números inteiros e mostre-os na ordem inversa.

    public static void main(String[] args) {

        int[] numeros = {11,7,8,10,2,5};

        for (int i = numeros.length-1; i >= 0; i--){
            System.out.println(numeros[i]);
        }

    }
}
