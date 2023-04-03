package com.loiane.estruturaDeDados.vetor.teste;

import com.loiane.estruturaDeDados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca("elemento 1")); // 0 - existe no vetor
        System.out.println(vetor.busca("Elemento 1")); // -1 - não existe no vetor
        System.out.println(vetor.busca("elemento 4")); // -1 - não existe no vetor
    }
}
