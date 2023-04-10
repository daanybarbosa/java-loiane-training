package com.loiane.estruturaDeDados.base;

/**
 * Pilhas (stacks)
 * - empilhar (push) - adiciona sempre no final do vetor
 * - desempilhar (pop) - remove sempre o último elemento do vetor
 *
 * LIFO - Comportamento da base
 * Last In First Out (Último a entrar, primeiro a sair)
 *
    Diagrama classe Pilha
 |          NOME        |  RETORNO  |   TIPO    |
 | elementos            | T[]       | função    |
 | tamanho              | int       | função    |
 | Pilha(int)           |           | método    |
 | empilha(T)           | void      | método    |
 | aumentaCapacidade()  | void      | método    |
 | estaVazia()          | void      | método    |
 | topo()               | T         | método    |
 | desempilha()         | T         | método    |
 | tamanho()            | int       | método    |
 | toString()           | String    | método    |
 */

/** Super classe
 * Irá guardar tudo que for incomum nas estruturas estaticas
 * */

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10); //capacidade
    }

    // protected - apenas as classes presentes no pacote base e as filhas dessa estrutura estatica poderão ter acesso a esses métodos
    protected boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {


            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }
}