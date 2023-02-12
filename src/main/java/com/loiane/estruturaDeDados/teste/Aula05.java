package com.loiane.estruturaDeDados.teste;

import com.loiane.estruturaDeDados.Vetor;

public class Aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1"); //0
        vetor.adiciona("elemento 2"); //1
        vetor.adiciona("elemento 3"); //2

        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca(5)); //null - exception
        System.out.println(vetor.busca(15)); //exception

    }
}
