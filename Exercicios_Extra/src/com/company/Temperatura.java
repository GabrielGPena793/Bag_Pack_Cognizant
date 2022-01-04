package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    /*
        Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
        Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
        e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
    */

    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura média dos 6 primeiros meses do ano:");
        for (int i = 1; i <= 6; i++){
            System.out.print( i + " = ");
            temperaturas.add(scanner.nextDouble());
        }

        Iterator<Double> media = temperaturas.iterator();
        double soma = 0;
        while (media.hasNext()){
            soma += media.next();
        }
        double mediaSemestral = soma/temperaturas.size();
        System.out.printf("A média Semestral foi: %.1f\n", mediaSemestral);

        System.out.println("=====================================");
        System.out.println("Meses acima da média semestral:");

        for (int i = 0; i < temperaturas.size(); i++){
            if (temperaturas.get(i) > mediaSemestral){

                switch (i) {
                    case 0 -> System.out.println("Janeiro: " + temperaturas.get(i));
                    case 1 -> System.out.println("Fevereiro: " + temperaturas.get(i));
                    case 2 -> System.out.println("Março: " + temperaturas.get(i));
                    case 3 -> System.out.println("Abril: " + temperaturas.get(i));
                    case 4 -> System.out.println("Maio: " + temperaturas.get(i));
                    case 5 -> System.out.println("Junho: " + temperaturas.get(i));
                }
            }
        }
    }
}
