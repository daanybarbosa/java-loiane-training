package com.loiane.estruturaDeDados.labs;

import com.loiane.estruturaDeDados.Lista;

import java.util.ArrayList;

/**
 * link: https://www.slideshare.net/loianeg/exercicios-vetores-arrays-estruturas-de-dados-e-algoritmos-com-java
 *
 * Aula 13 - Exercicio 2 - Método ultimoIndice
 * Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe ArrayList.
 */
public class Exer02 {

    public static void main(String[] args) {

        //Exemplo - lastIndexOf
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        System.out.println(arrayList.lastIndexOf("A"));

        //Exemplo - método ultimoIndice
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        System.out.println(lista.ultimoIndice("A"));
    }
}
