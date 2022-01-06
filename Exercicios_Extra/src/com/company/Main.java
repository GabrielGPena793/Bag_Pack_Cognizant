package com.company;

import java.util.*;

public class Main {

        /*
        Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
        Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
        a) Ordem de inserção;
        b) Ordem natural(nome);
        c) IDE;
        d) Ano de criação e nome;
        e) Nome, ano de criação e IDE;
        Ao final, exiba as linguagens no console, um abaixo da outra.
    */

    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("C#", "bVS", 2000));
        linguagens.add(new LinguagemFavorita("javaScript", "aVSCode", 1995));
        linguagens.add(new LinguagemFavorita("java", "IteliJ", 1991));

        System.out.println("Ordem inserção: \n" + linguagens);

        //nome
        linguagens = new TreeSet<>(linguagens);
        System.out.println("Ordem natural(nome): \n" + linguagens);

        //ide
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(Comparator.comparing(ide -> ide.getIde()));
        linguagens2.addAll(linguagens);
        System.out.println("Ordem por Ide \n" + linguagens2);

        //ano criação e nome
        linguagens2 = new TreeSet<>(Comparator.comparing(anoNome -> anoNome.getAnoDeCriacao()));
        linguagens2.addAll(linguagens);
        System.out.println("Ordem por ano e nome \n" + linguagens2);

        //Nome, ano de criação e IDE;
        linguagens2 = new TreeSet<>(new Comparator<LinguagemFavorita>() {
            @Override
            public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
                int comparacaoNome = o1.getNome().compareToIgnoreCase(o2.getNome());
                if (comparacaoNome != 0) return comparacaoNome;

                int comparacaoAno = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
                if (comparacaoAno != 0) return comparacaoAno;

                return o1.getIde().compareToIgnoreCase(o2.getIde());
            }
        });
        linguagens2.addAll(linguagens);
        System.out.println("Ordem por nome/ano/Ide \n" + linguagens2);

    }
}