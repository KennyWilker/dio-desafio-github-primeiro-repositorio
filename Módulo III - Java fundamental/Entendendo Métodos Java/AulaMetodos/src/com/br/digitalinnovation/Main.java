package com.br.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,3);
        Calculadora.subtracao(5,2);
        Calculadora.mutiplicacao(3,3);
        Calculadora.divisao(9,3);

        //Mensagem
        System.out.println("Exercíco mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Eempréstimo
        System.out.println("Exercício emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Sobrecarga de método
        System.out.println("Exercício áreas.");
        double areaQuadradoo = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadradoo);
        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área retangulo:" + areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio é:" + areaTrapezio);
        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Área do Losango é:" + areaLosango);
    }
}