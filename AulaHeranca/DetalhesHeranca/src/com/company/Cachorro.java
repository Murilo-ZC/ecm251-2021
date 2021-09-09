package com.company;

public class Cachorro extends Animal{
    public Cachorro(String nome, int peso) {
        super.nome = nome;
        super.peso = peso;
    }

    @Override
    public String fazerBarulho() {
        return "Auau";
    }


}
