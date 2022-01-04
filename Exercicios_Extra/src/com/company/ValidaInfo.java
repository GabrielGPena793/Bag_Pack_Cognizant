package com.company;

import java.util.Scanner;


public class ValidaInfo {

/*   Faça um programa que leia e valide as seguintes informações:
    Nome: maior que 3 caracteres;
    Idade: entre 0 e 150;
    Salário: maior que zero;
    Sexo: 'f' ou 'm';
    Estado Civil: 's', 'c', 'v', 'd';
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  nome, sexo, estadoCivilCliente;
        int idade;
        double salario;
        boolean erroValidacao;

        do {

            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() <= 3) System.out.println("Seu nome tem que ter mais que 3 caracteres");

        }while (nome.length() <= 3 );

        do {

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 150) System.out.println("A idade tem que estar entre 0 - 150");

        }while (idade < 0 || idade > 150);

        do {

            System.out.println("Digite seu salário: ");
            salario = scanner.nextDouble();
            if (salario <= 0) System.out.println("Digite um sálario maior que zero");
            scanner.nextLine();
        }while (salario <= 0);

        do {

            System.out.println("""
                Informe seu sexo:
                F - Feminino
                M - Masculino
                """);
            sexo = scanner.nextLine();

            String[] sexoPattern = {"f", "m"};
            erroValidacao = verificaArray(sexoPattern, sexo);

        }while (erroValidacao);

        do {
            System.out.println("""
                Informe seu estado civil:
                S - Solteiro(a)
                C - Casado(a)
                V - Viuvo(a)
                D - Divorciado(a)
                """);
            estadoCivilCliente = scanner.nextLine();

            String[] estadoCivilPattern = {"s", "c", "v", "d"};
            erroValidacao = verificaArray(estadoCivilPattern, estadoCivilCliente);

        }while (erroValidacao);

        System.out.println("Castro feito com sucesso!");

    }

    //validando padrões com a entrada
    public static boolean verificaArray(String[] Pattern, String entradaCliente ){

        for (String padrao : Pattern) {
            if (entradaCliente.equalsIgnoreCase(padrao)) return false;

            if (padrao.equals(Pattern[Pattern.length - 1])) {
                System.out.println("Digite uma da opções");
            }
        }
        return  true;
    }
}
