package com.company;

public class Animal {
    protected String nome;
    protected int peso;

    public String fazerBarulho(){
        return "Lala";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
