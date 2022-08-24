package com.br.ap3.gilwanSouza;

public class Caneta {
    private String Modelo;
    private int numDaPonta;
    private int nivelTinta;
    private int tampada;
    private int destampada;
    private int cor;

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getnumDaPonta() {
        return this.numDaPonta;
    }

    public void setnumDaPonta(int numDaPonta) {
        this.numDaPonta = numDaPonta;
    }

    public int getnivelTinta() {
        return this.nivelTinta;
    }

    public void setnivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public boolean gettampada() {
        return this.tampada;
    }

    public void settampada(Boolean tampada) {
        this.tampada = tampada;
    }

    public boolean getdestampada() {
        return this.destampada;
    }

    public void setdestampada(Boolean destampada) {
        this.destampada = destampada;
    }

    public String getcor() {
        return this.cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Modelo: " + this.Modelo + "/n" +
                "Numeração da ponta: " + this.numDaPonta +
                "Nivel de tinta: " + this.nivelTinta +
                "Tampada: " + this.tampada +
                "Destmapada: " + this.destampada +
                "Cor: " + this.cor;
    }
}