package com.company.ArraysExercicio;

import java.util.Random;

public class Multidimensional {

/*    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
    Após isso determine o menor número da matriz e a sua posição(linha, coluna).*/

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int l = 0; l < M.length; l++){

            for (int c = 0; c < M[l].length; c++){
                M[l][c] = random.nextInt(9);
            }
        }

        int menorNumero = M[0][0];
        int menorLinha = 0;

        for (int l = 0; l < M.length; l++){
            System.out.println("linha " + l);
            for (int c = 0; c < M[l].length ; c++){
                System.out.print(M[l][c] + " ");

                if ( menorNumero > M[l][c]){
                    menorNumero = M[l][c];
                    menorLinha = l;
                }
            }
            System.out.println();
        }

        System.out.println("O menor número: " + menorNumero + " linha: " + menorLinha);


    }
}
