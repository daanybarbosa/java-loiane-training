package com.loiane.estruturaDeDados.vetor.teste;

import com.loiane.estruturaDeDados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        //Exemplo 1
        /*vetor.adiciona("elemento 1");
        System.out.println(vetor);*/

        //Adiciona o elemento no final do vetor, caso ultrapasse a qtde do vetor irá lançar uma exception
        /*try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(vetor);*/

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor);
    }
}
