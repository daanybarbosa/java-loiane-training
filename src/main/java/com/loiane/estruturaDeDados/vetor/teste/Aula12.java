package com.loiane.estruturaDeDados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {

        //ArrayList<Tipo>
        //ArrayList<String> arrayList = new ArrayList<>(5); //capacidade inicial
        ArrayList<String> arrayList = new ArrayList<>(); //instanciar a classe com o construtor vazio

        //ira adicionar os elementos no final da classe
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        //adicionar o elemento B na posição 1
        arrayList.add(1, "B");
        System.out.println(arrayList);

        //busca o elemento no array
        boolean existe = arrayList.contains("A");
        if (existe){
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento NÃO existe no array");
        }

        // busca o elemento pelo o indice
        // se encontrar o elemento retorna o indice, senão retorna -1
        int pos = arrayList.indexOf("D");
        if (pos > -1){
            System.out.println("Elemento existe no array " + pos);
        } else {
            System.out.println("Elemento NÃO existe no array " + pos);
        }

        //busca por posicao
        System.out.println(arrayList.get(2)); //posicao 2
        //System.out.println(arrayList.get(4)); //retorna uma exception - IndexOutOfBoundsException

        //remover elemento do array
        arrayList.remove(0); //remove pelo indice
        arrayList.remove("B"); //remove pelo elemento
        System.out.println(arrayList);

        //tamanho do array
        System.out.println(arrayList.size());

        //limpar todos os elementos da lista
        //arrayList.clear();

        //verifica se o array está vazio
        if (arrayList.isEmpty()) {
            System.out.println("Array está vazio");
        } else {
            System.out.println("Array NÃO está vazio");
        }

        //Sobreescrever um elemento de uma determinada posição
        arrayList.set(0, "A");
        System.out.println(arrayList);

    }
}
