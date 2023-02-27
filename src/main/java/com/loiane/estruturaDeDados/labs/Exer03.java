package com.loiane.estruturaDeDados.labs;

import com.loiane.estruturaDeDados.Lista;

/** Exercicio 3 - Método removeElemento
 * Melhore a classe Lista e implemente o método remove(T elemento), onde será possivel remover um
 * elemento da lista passando o mesmo como parametro.
 */

public class Exer03 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);

        lista.remove("B");
        System.out.println(lista);

        lista.remove("E");
        System.out.println(lista);

        lista.remove("C");
        System.out.println(lista);

        lista.remove("D");
        System.out.println(lista);

        lista.remove("A");
        System.out.println(lista); //exception IllegalArgumentException: Posicao invalida
    }
}
