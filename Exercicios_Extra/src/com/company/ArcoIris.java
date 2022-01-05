package com.company;

import java.util.*;

public class ArcoIris {

/*    Crie um conjunto contendo as cores do arco-íris e:
    Exiba todas as cores uma abaixo da outra
    A quantidade de cores que o arco-íris tem
    Exiba as cores em ordem alfabética
    Exiba as cores na ordem inversa da que foi informada
    Exiba todas as cores que começam com a letra ”v”
    Remova todas as cores que não começam com a letra “v”
    Limpe o conjunto
    Confira se o conjunto está vazio*/

    public static void main(String[] args) {
        Set<String> cores = new TreeSet<>(
                Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));

        //Exiba todas as cores uma abaixo da outra
        System.out.println("Cores do arco-íris:");
        for (String cor: cores) {
            System.out.println(cor);
        }

        //A quantidade de cores que o arco-íris tem
        System.out.println("O arco-íris tem " + cores.size() + " cores");

        //Exiba as cores em ordem alfabética
        System.out.println(cores);

        //Exiba as cores na ordem inversa da que foi informada
       List<String> cores2 = new ArrayList<>(cores);
       Collections.reverse(cores2);
       System.out.println(cores2);

       //Exiba todas as cores que começam com a letra ”v”
        for (String cor: cores) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        //Remova todas as cores que não começam com a letra “v”
        cores.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(cores);

        //Limpe o conjunto
        cores.clear();

        //Confira se o conjunto está vazio
        System.out.println("Cores está vazio ? " + cores.isEmpty());

    }
}
