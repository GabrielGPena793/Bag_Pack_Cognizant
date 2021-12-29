package com.company.Model;

public class Emprestimo {

    public static void calcularEmprestimo(int valor, int parcelas){

        if (parcelas == 2){
            double valorFinal = valor + (valor * 0.05);
            System.out.println("O valor total vai ficar R$" + valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valor + (valor * 0.10);
            System.out.println("O valor total vai ficar R$" + valorFinal);
        }else if (parcelas == 4){
            double valorFinal = valor + (valor * 0.15);
            System.out.println("O valor total vai ficar R$" + valorFinal);
        }else if (parcelas == 5){
            double valorFinal = valor + (valor * 0.20);
            System.out.println("O valor total vai ficar R$" + valorFinal);
        }else {
            System.out.println("Número de parcelas inválido");
        }
    }
}
