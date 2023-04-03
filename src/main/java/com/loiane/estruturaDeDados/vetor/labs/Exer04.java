package com.loiane.estruturaDeDados.vetor.labs;

import com.loiane.estruturaDeDados.vetor.Lista;

/**
 * Exercicio 4 - Método obtém (get)
 * Melhore a classe Lista e implemente o método obtem(int posicao),
 * onde será possivel obter o elemento dada uma posicao do vetor.
 * Esse método é semelhante ao método get (int posicao) da classe ArrayList.
 */
public class Exer04 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }
}
