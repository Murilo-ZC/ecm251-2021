package br.maua.model;

/**
 * Classe que representa uma pessoa.
 */
public class Pessoa {
    final private String nome;
    final private String cpf;

    /**
     * Construtor da classe pessoa
     * @param nome Nome atribuido a pessoa
     * @param cpf CPF atribuido a pessoa
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Devolve o estado do objeto pessoa.
     * @return
     */
    @Override
    public String toString() {
        return "Pessoal{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
