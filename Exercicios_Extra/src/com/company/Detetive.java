package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Detetive {

    /*
        Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vítima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
        "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
    */

    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ===============================================
                Responda as seguintes perguntas com sim ou não:
                ===============================================
                """);
        System.out.println("Telefonou para a vítima?");
        respostas.add(scanner.nextLine());

        System.out.println("Esteve no local do crime?");
        respostas.add(scanner.nextLine());

        System.out.println("Mora perto da vítima?");
        respostas.add(scanner.nextLine());

        System.out.println("Devia para a vítima?");
        respostas.add(scanner.nextLine());

        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scanner.nextLine());

        Iterator<String> iterator = respostas.iterator();
        int respostasPositivas = 0;
        while (iterator.hasNext()){
            if (iterator.next().equalsIgnoreCase("sim")) respostasPositivas++;
        }

        switch (respostasPositivas){
            case 2 -> System.out.println("Suspeita");
            case 3 , 4 -> System.out.println("Cúmplice");
            case 5 -> System.out.println("Assassina");
            default -> System.out.println("Inocente");
        }



    }
}
