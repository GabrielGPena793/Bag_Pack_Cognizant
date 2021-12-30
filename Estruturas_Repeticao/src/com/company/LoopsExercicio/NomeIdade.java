package com.company.LoopsExercicio;

import java.util.Scanner;

public class NomeIdade {
//    Faça um programa que leia conjuntos de dois valores, o primeiro representando a
//    nome do aluno e o segundo representando a sua idade. (Pare inserindo o valor 0 no campo nome)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        do {
            System.out.println("Nome: ");
            nome = scanner.next();

            if (nome.equals("0")) break;

            System.out.println("idade: ");
            idade = scanner.nextInt();
        }while (true);

        System.out.println("Encerrando programa...");

    }
}
