package com.company.Model;

public class Mensagem {

    public static void saudacao(int hora){

        if (hora < 5){
            System.out.println("Boa Madrugada");
        }else if(hora < 12){
            System.out.println("Bom Dia");
        }else if(hora < 18){
            System.out.println("Boa Tarde");
        }else if(hora < 24){
            System.out.println("Boa Noite");
        }else {
            System.out.println("Hora inválida");
        }
    }
}
