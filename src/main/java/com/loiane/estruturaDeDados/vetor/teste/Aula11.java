package com.loiane.estruturaDeDados.vetor.teste;

import com.loiane.estruturaDeDados.vetor.Lista;
import com.loiane.estruturaDeDados.vetor.VetorObjetos;

// ---------------------------------------------------------------------------------------------
// ------------ Aula 11 - Definindo o tipo de vetor dinamicamente ------------------------------
public class Aula11 {

    public static void main(String[] args) {

        // Exemplo sem generics
        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento do tipo string");
        System.out.println(vetor); //adiciona dois tipos diferentes (inteiro e String)

        // Exemplo com generics
        // A partir do Java 7 não precisa colocar o new Lista<String>, apenas na declaração
        // Lista<Tipo>
        Lista<String> vetor2 = new Lista<>(1);
        vetor2.adiciona("Elemento 1");
        //vetor2.adiciona(1); //erro - nao deixa adicionar um inteiro
        System.out.println(vetor2);

        // Exemplo com generics
        Lista<Contato> vetor3 = new Lista<Contato>(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "5678-1234", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "9878-6543", "contato3@email.com");

        vetor3.adiciona(c1);
        vetor3.adiciona(c2);
        vetor3.adiciona(c3);

        System.out.println(vetor3);
    }
}
