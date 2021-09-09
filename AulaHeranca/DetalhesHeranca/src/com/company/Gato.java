package com.company;

public class Gato extends Animal{

    public Gato(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String fazerBarulho() {
        return "Miau";
    }
}
