package com.company;

import java.util.*;

public class Populacao {

    public static void main(String[] args) {
    //Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> populacao = new HashMap<>();
        populacao.put("PE", 9616621);
        populacao.put("AL", 3351543);
        populacao.put("CE", 9616621);
        populacao.put("RN", 3534265);
        System.out.println(populacao);

    //Substitua a população do estado do RN por 3.534.165;
        populacao.put("RN", 3534165);
        System.out.println(populacao);

    //Confira se o estado PB está no dicionário, caso não adicione: PB -4.039.277;
        if (!populacao.containsKey("PB")) populacao.put("PB", 4039277);
        System.out.println(populacao);

    //Exiba a população PE;
        System.out.println("População de PE: " + populacao.get("PE") );

    //Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String, Integer> populacao2 = new LinkedHashMap<>();
        populacao2.put("PE", 9616621);
        populacao2.put("AL", 3351543);
        populacao2.put("CE", 9616621);
        populacao2.put("RN", 3534265);
        System.out.println(populacao2);

    //Exiba os estados e suas populações em ordem alfabética;
        populacao2 = new TreeMap<>(populacao);
        System.out.println(populacao2);

    //Exiba o estado com o menor população e sua quantidade
    //Exiba o estado com a maior população e sua quantidade;
        Collection<Integer> populacaoValores = populacao.values();
        String estadoMenorPopulacao = "";
        String estadoMaiorPopulacao = "";
        Set<Map.Entry<String, Integer>>  entries = populacao.entrySet();
        Integer maiorValor = Collections.max(populacaoValores);
        Integer menorValor = Collections.min(populacaoValores);

        System.out.println("Estado com maior população:");
        for (Map.Entry<String, Integer> entrie: entries) {

            if (entrie.getValue().equals(maiorValor)){
                estadoMaiorPopulacao = entrie.getKey();
                System.out.println(estadoMaiorPopulacao + " = " + maiorValor);
            }
        }

        System.out.println("Estado com menor população:");
        for (Map.Entry<String, Integer> entrie: entries) {
            if (entrie.getValue().equals(menorValor)) {
                estadoMenorPopulacao = entrie.getKey();
                System.out.println(estadoMenorPopulacao + " = " + menorValor);
            }
        }

    //Exiba a soma da população desses estados;
        Integer valorTotal = 0;
        for (Integer valor: populacaoValores) {
            valorTotal += valor;
        }
        System.out.println("Soma de todos da população de todos os estados: " + valorTotal);

    //Exiba a média da população deste dicionário de estados;
        System.out.println("Media da população dos estadis: " + (valorTotal/populacao.size()));

    //Remova os estados com a população menor que 4.000.000;
        entries.removeIf(populacaoQuantidade -> populacaoQuantidade.getValue() < 4000000);

        System.out.println(populacao);

    //Apague o dicionário de estados;
        populacao.clear();
    //Confira se o dicionário está vazio.
        System.out.println("O dicionario está vazio ? " + populacao.isEmpty());
    }
}
