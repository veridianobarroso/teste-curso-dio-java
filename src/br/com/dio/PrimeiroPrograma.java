package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//        int a = 5;
//          int b = 3;
        Gato gato = new Gato();
//        System.out.println("Hello" + (a+b));
        System.out.println(gato);
        Livro livro = new Livro("meu livro",12);
        System.out.println(livro);
    }

}
class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
