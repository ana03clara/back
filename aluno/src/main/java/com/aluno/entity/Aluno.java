package com.aluno.entity;

public class Aluno {
    private Long id;
    private String nome;
    private Double nota;

    public Aluno(){
    }

    public boolean estaAprovado(double nota){
        return nota >=7;
    }

    public Aluno(String nome,Double nota) {
        this.nota = nota;
        this.nome=nome;
    }

    public Aluno(Long id, String nome, double nota){
        this.id = id;
        this.nome= nome;
        this.nota = nota;
    }

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public Double getNota(){
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
