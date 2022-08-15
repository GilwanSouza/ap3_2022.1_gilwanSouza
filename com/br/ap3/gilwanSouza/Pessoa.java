package com.br.ap3.gilwanSouza;

public class Pessoa{
    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //método void retornando coisa?
    public void getIdade(int idade){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Nome da pessoa: "+this.nome+"\n"+
                "Idade da pessoa: "+this.idade;
    }
}