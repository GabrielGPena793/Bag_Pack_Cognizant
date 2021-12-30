package com.company.LoopsExercicio;


public class MaiorMedia {

//    Faça um programa que leia 5 números e informe o maior número e a média desses números.

    public static void main(String[] args) {
        int[] numeros = {5,100,20,80,720};
        int contagem = 0;
        int maiorNumero = 0;
        int mediaNumeros = 0;

        do {
                                                    //verificando e adicionando o maior número
            if (numeros[contagem] > maiorNumero)
                maiorNumero = numeros[contagem];
                                                    //adicionando todos os números numa variável
            mediaNumeros += numeros[contagem];
            contagem++;                             //adicionado mais um a contagem


        }while (contagem < numeros.length);

        mediaNumeros = mediaNumeros / numeros.length; // dividindo pelo total e tirando a média

        System.out.println("O maior número é: " + maiorNumero );
        System.out.println("E a média total do array é: " +  mediaNumeros);

    }
}
