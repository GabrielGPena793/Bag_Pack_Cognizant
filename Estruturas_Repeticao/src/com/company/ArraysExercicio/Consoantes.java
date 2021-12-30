package com.company.ArraysExercicio;

public class Consoantes {

//    Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

    public static void main(String[] args) {
        String[] letras = {"B","G","A","E","W","H"};
        String consoantes = "";
        int quantidadeConsoantes = 0;

        for (String letra : letras) {
            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes += letra + " ";
                quantidadeConsoantes++;
            }
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes  +
                "\nConsoantes: " + consoantes.trim());
    }
}
