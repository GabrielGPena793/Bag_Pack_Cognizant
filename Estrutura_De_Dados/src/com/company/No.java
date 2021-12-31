package com.company;

public class No<T> {

    private T conteudo;
    private No<T> outroNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getOutroNo() {
        return outroNo;
    }

    public void setOutroNo(No<T> outroNo) {
        this.outroNo = outroNo;
    }

    @Override
    public String toString() {
        return "Nó: " + conteudo;
    }
}
