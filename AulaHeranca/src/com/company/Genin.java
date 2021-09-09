package com.company;

public class Genin extends Ninja{
    private String missao;
    public Genin(String nome, String familia, String missao){
        super(nome, familia);
        this.missao = missao;
    }

    public String getMissao() {
        return missao;
    }
}
