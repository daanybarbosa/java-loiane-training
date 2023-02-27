package com.loiane.estruturaDeDados.labs;

import com.loiane.estruturaDeDados.Lista;

import java.util.ArrayList;

/**
 * Exercicio 5 - Método limpar todos os elementos
 * Melhore a classe Lista e implemente o método limpar, onde todos os elementos da lista são removidos.
 * Esse método é semelhante ao método clear da classe ArrayList.
 */
public class Exer05 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear(); //limpar todos os elementos

        System.out.println("arrayList - " + arrayList);

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println("lista - " + lista);
    }
}
