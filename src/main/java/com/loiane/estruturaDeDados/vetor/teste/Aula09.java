package com.loiane.estruturaDeDados.vetor.teste;

import com.loiane.estruturaDeDados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        System.out.print("Remover o elemento na posição 1: ");
        vetor.remove(1);
        System.out.println(vetor);

        System.out.print("Remover o elemento E: ");
        //int pos = vetor.busca("E");
        int pos = vetor.busca("A");

        if (pos > -1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento nao existe!");
        }

        System.out.println(vetor);
    }
}
