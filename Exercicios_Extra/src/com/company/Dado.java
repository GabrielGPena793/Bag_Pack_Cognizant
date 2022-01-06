package com.company;

import java.util.*;

public class Dado {
    /*
    Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
    Depois, mostre quantas vezes cada valor foi conseguido.
 */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 100; i++){
            numeros.add(random.nextInt(1,7));
        }

        Map<Integer, Integer> lacamentos = new HashMap<>();
        for (Integer numero: numeros) {

            if (!lacamentos.containsKey(numero)){
                lacamentos.put(numero, 1);

            }else{
                lacamentos.put(numero, lacamentos.get(numero) + 1);
            }
        }

        System.out.println(lacamentos);
    }
}
