package api.pessoa;

import api.endereco.Endereco;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;

    public void setPessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
