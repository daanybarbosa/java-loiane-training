package com.loiane.estruturaDeDados.teste;

import com.loiane.estruturaDeDados.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        vetor.adiciona("3"); // classe wrapper - autoboxing
        vetor.adiciona("4"); // classe wrapper - autoboxing
        vetor.adiciona("5"); // classe wrapper - autoboxing

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "5678-1234", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "9878-6543", "contato3@email.com");
        Contato c4 = new Contato("Contato 1", "1234-5678", "contato1@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);

        int pos = vetor.busca(c4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento nao existe no vetor");
        }
        System.out.println(vetor);
    }
}
