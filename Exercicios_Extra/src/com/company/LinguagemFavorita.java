package com.company;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome, ide;
    private Integer anoDeCriacao;

    public LinguagemFavorita(String nome, String ide, int anoDeCriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita: " +
                "nome='" + nome + '\'' +
                ", ide='" + ide + '\'' +
                ", anoDeCriacao=" + anoDeCriacao;
    }


    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);

    }
}
