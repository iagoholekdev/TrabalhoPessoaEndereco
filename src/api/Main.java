package api;

import api.endereco.Endereco;
import api.pessoa.Pessoa;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setEndereco("Rua das Flores", 123, "São Paulo");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setPessoa("João", 25, endereco1);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Endereço: " + pessoa1.getEndereco().getRua() +
                ", " + pessoa1.getEndereco().getNumero() +
                ", " + pessoa1.getEndereco().getCidade());

        Endereco endereco2 = new Endereco();
        endereco2.setEndereco("Avenida Paulista", 2000, "São Paulo");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setPessoa("Maria", 30, endereco2);

        System.out.println("\nNome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Endereço: " + pessoa2.getEndereco().getRua() +
                ", " + pessoa2.getEndereco().getNumero() +
                ", " + pessoa2.getEndereco().getCidade());
    }

}
