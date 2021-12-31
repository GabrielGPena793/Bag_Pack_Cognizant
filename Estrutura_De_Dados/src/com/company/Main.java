package com.company;

public class Main {

    public static void main(String[] args) {
        //exemplo de estrutura de um nó
        No<String> no1 = new No<>("Conteudo 1");
        No<String> no2 = new No<>("Conteudo 2");
        No<String> no3 = new No<>("Conteudo 3");
        No<String> no4 = new No<>("Conteudo 4");

        no1.setOutroNo(no2);
        no2.setOutroNo(no3);
        no3.setOutroNo(no4);

        System.out.println(no1);
        System.out.println(no1.getOutroNo());
        System.out.println(no1.getOutroNo().getOutroNo());
        System.out.println(no1.getOutroNo().getOutroNo().getOutroNo());
        System.out.println(no1.getOutroNo().getOutroNo().getOutroNo().getOutroNo());

    }

}
