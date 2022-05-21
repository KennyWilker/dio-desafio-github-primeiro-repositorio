package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgram {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Lovro lovro = new Lovro("O problema dos 3 corpos", numPag: 300);
        System.out.println(lovro);
        /*int a = 5;
        int b = 3;
        System.out.println("Hello Word");*/
    }
}

class Lovro {
    private String nome;
    private String numPag;

    public Lovro(String nome, String numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }
}