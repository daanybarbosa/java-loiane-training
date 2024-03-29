package com.loiane.estruturaDeDados.vetor.labs;

import com.loiane.estruturaDeDados.vetor.Lista;

/**
 * link: https://www.slideshare.net/loianeg/exercicios-vetores-arrays-estruturas-de-dados-e-algoritmos-com-java
 *
 * Aula 12 - Exercicio 1 - Método Contém
 * Melhore a classe Lista e implemente o método contém, semelhante ao método contains da classe ArrayList
 */
public class Exer01 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
