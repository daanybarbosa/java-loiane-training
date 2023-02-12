package com.loiane.basico;

/**
 * Aula 07 - Entendendo Erros
 *
 * Tipos de Erros
 * - Erros de Sintaxe
 * - Erros de Semântica
 * - Erros em tempo de execução
 *
 */
public class Aula03_EntendendoErros {

    public static void main(String[] args) {
        // Erro de sintaxe
        // 1 Erro - unclosed string literal
        //System.out.println("Hello World)

        // Solução
        //System.out.println("Hello World");

        // -------------------------------------

        // Erro de semantica
        // 2 Erro - variable cont might not have been initialized
        //int cont;
        //System.out.println("Voce digitou: " + cont);

        //Solução
        //int cont = 0;
        //System.out.println("Voce digitou: " + cont);

        // -------------------------------------

        // Erro em tempo de execução
        // Erro - ArithmeticException: / by zero
        //System.out.println("Voce digitou: " + 1/0);

    }
}