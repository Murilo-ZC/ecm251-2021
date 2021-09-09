package com.company;

public class Main {

    public static void main(String[] args) {
	 Ninja ninja = new Ninja("Naruto", "Uzumaki");
	 System.out.println(ninja.apresentacao());
	 Genin genin = new Genin("Sakura", "Haruno", "Atrapalhar o role");
        System.out.println(genin.apresentacao());
        System.out.println("Missao:"+ genin.getMissao());
    }
}
