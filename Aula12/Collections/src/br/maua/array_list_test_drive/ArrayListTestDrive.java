package br.maua.array_list_test_drive;

import br.maua.model.Conta;
import br.maua.model.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        //Adiciona um elemento dentro da lista
        pessoas.add(new Pessoa("All Might", "01234"));
        pessoas.add(new Pessoa("Endevor", "45678"));
        pessoas.add(new Pessoa("Hawk", "8974"));

        System.out.println("Todos os elementos do ArrayList:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        //Adiciona um elemento no ArrayList
        pessoas.add(1,new Pessoa("Midoria", "999"));

        System.out.println("Todos os elementos do ArrayList:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        //Cria e depois inicializa diversos valores no arrayList
        List<Conta> contas = new ArrayList<>();
        contas.addAll(Arrays.asList(new Conta(), new Conta(90.0)));
        System.out.println("Todos os elementos do ArrayList:");
        contas.forEach(conta -> System.out.println(conta));
    }
}
