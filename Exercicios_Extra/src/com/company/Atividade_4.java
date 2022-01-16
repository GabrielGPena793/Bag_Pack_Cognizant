package com.company;

public class Atividade_4 {
/*    Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
    e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
    e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,
    mantidas as taxas de crescimento.
    */

    public static void main(String[] args) {
        double paisA = 80000;
        double paisB = 200000;

        int anos = 0;
        while ( paisA <= paisB){
            paisA = paisA + (paisA * 1.03);
            paisB = paisB + (paisB + 1.015);
            anos++;
        }

        System.out.println("Vai demorar " + anos + " anos para o páis A alcançar o pais B.");

    }
}
