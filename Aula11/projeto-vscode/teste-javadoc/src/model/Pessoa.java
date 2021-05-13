package model;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    
    /**
     * Método construtor da classe Pessoa
     * @param nome Atributo nome
     * @param cpf Atributo CPF
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String cpf) {
        this.nome = "";
        this.cpf = cpf;
    }

    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }

    
    /** 
     * @return String
     */
    public String getCpf() {
        return cpf;
    }

}
