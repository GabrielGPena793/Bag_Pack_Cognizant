package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        while(leitor.hasNext()){
            int senha = leitor.nextInt();

            if(senha != 2002) System.out.println("Senha Invalida");
            else {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
