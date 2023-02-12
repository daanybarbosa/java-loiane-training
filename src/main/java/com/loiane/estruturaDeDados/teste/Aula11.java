package com.loiane.estruturaDeDados.teste;

import com.loiane.estruturaDeDados.Lista;

// ---------------------------------------------------------------------------------------------
// ------------ Aula 11 - Definindo o tipo de vetor dinamicamente ------------------------------
public class Aula11 {

    public static void main(String[] args) {

        // Exemplo sem generics
        /*VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento do tipo string");
        System.out.println(vetor);
         */

        // Exemplo com generics
        // A partir do Java 7 não precisa colocar o new Lista<String>, apenas na declaração
        Lista<String> vetor = new Lista<>(1);
    }
}
