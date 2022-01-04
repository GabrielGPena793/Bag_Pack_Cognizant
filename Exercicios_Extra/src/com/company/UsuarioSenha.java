package com.company;

import java.util.Scanner;

public class UsuarioSenha {

/*    Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
    mostrando uma mensagem de erro e voltando a pedir as informações.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        while (senha.equals(nome)){
            System.err.println("Sua senha não pode ser igual ao seu nome, digite uma senha diferente do seu nome: ");
            System.out.println("Digite uma senha valida:");
            senha = scanner.nextLine();
        }

        System.out.println("Obrigado por se cadastrar " + nome + "!");


    }
}
