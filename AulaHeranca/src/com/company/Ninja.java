package com.company;

public class Ninja {
    private String nome;
    private String familia;

    public Ninja(String nome, String familia) {
        this.nome = nome;
        this.familia = familia;
    }

    public String getNome() {
        return nome;
    }

    public String getFamilia() {
        return familia;
    }

    public String apresentacao(){
        return "ola sou o "+nome+ " da familia "+familia;
    }
}
