package com.company.LoopsExercicio;

import java.util.Scanner;

public class Tabuada {
//    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//    O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

//    Tabuada de 5:
//            5 X 1 = 5
//            5 X 2 = 10
//            ...
//            5 X 10 = 50

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a tabuada entre 1 e 10 que deseja ver:");
        int resposta = scanner.nextInt();

        while (resposta < 1 || resposta > 10){
            System.out.println("Informe um número entre 1 e 10");
            resposta = scanner.nextInt();
        }

        for (int i = 0 ; i <= 10; i++){
            System.out.println( resposta + " x " + i + " = " + (resposta * i));
        }
    }
}
