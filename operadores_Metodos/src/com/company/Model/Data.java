package com.company.Model;

import java.util.Scanner;

public class Data {
    Scanner scanner = new Scanner(System.in);

    public  void mesAno() {

        System.out.println("Indique o número do mês");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1 -> System.out.println(mes + " - Janeiro");
            case 2 -> System.out.println(mes + " - Fevereiro");
            case 3 -> System.out.println(mes + " - Março");
            case 4 -> System.out.println(mes + " - Abril");
            case 5 -> System.out.println(mes + " - Maio");
            case 6 -> System.out.println(mes + " - Junho");
            case 7 -> System.out.println(mes + " - Julho");
            case 8 -> System.out.println(mes + " - Agosto");
            case 9 -> System.out.println(mes + " - Setembro");
            case 10 -> System.out.println(mes + " - Outubro");
            case 11 -> System.out.println(mes + " - Novembro");
            case 12 -> System.out.println(mes + " - Dezembro");
            default -> System.out.println(mes + " - Mês inválido!");
        }

        mesFerias(mes);

    }

    public  void mesFerias(int mes) {
        int[] mesFerias = {1, 7, 12};

        for (int ferias : mesFerias) {
            if (mes == ferias) {
                System.out.println("Férias");
            }
        }
    }

    public void diaSemana(){

        System.out.println("Indique o número da semana");
        int dia = scanner.nextInt();

        switch (dia){
            case 1 -> System.out.println(dia + " - Domingo");
            case 2 -> System.out.println(dia + " - Segunda");
            case 3 -> System.out.println(dia + " - Terça");
            case 4 -> System.out.println(dia + " - Quarta");
            case 5 -> System.out.println(dia + " - Quinta");
            case 6 -> System.out.println(dia + " - Sexta");
            case 7 -> System.out.println(dia + " - Sábado");
        }
    }

}
