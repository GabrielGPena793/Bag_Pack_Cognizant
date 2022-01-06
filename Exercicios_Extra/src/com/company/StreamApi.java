package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "10", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos =  numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatorios.stream()
                        .mapToInt(Integer::parseInt)
                        .min()
                        .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        int somaDosNumerosPares = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .sum();
        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        Set<String> numeros = numerosAleatorios.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toSet());
        System.out.println(numeros);

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt).toList();

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy( i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
