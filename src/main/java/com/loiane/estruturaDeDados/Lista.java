package com.loiane.estruturaDeDados;

import java.lang.reflect.Array;

// ---------------------------------------------------------------------------------------------
// ------------ Exemplo da Aula 11 - Definindo o tipo de vetor dinamicamente -------------------
// Generics
// <> - conhecido como operador "diamond" (diamante)
// T - class type (tipo da classe)
public class Lista<T> {

    //private T[] elementos; // tipo dinamico
    private Object[] elementos; // tipo dinamico
    private int tamanho;

    //vetor generico
    public Lista(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    //refletion - API que deixa acessar dinamicamente as classes, atributos, e podemos manipular essas informações
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    // ---------------------------------------------------------------------------------------------
    // ------ Aula 03 - Adicionar o elemento no final do vetor (se tiver algum elemento null) ------
    public boolean adiciona(Object elemento) {

        this.aumentaCapacidade(); //metodo da aula 8

        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    // ---------------------------------------------------------------------------------------------
    // ----------- Aula 04 - Verifica tamanho ----------------------------------------------------------------
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

    // ---------------------------------------------------------------------------------------------
    // ------- Aula 05 - busca - obter um elemento de uma determinada posição --------------------------------
    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) { //range de todas as posições que nao podem ser acessadas
            throw new IllegalArgumentException("Posicao invalida"); //argumentos invalidos
        }

        return this.elementos[posicao];
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 06 - Verificar se o elemento existe no vetor ----------------------------------------

    public int busca(Object elemento) {
        //busca sequencial - vai em posição em posição e procura o elemento que estamos buscando
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 07 - Adiciona elemento em qualquer posição --------------------------------
    public boolean adiciona(int posicao, Object elemento) {

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

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 08 - Aumentar capacidade ao vetor -----------------------------------------
    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {

            //declarar um novo vetor
            Object[] elementosNovos = new Object[this.elementos.length * 2]; //dobrar o tamanho do vetor

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            //atribuir o novo vetor, ao vetor antigo
            this.elementos = elementosNovos;
        }
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 09 - Remover elementos do vetor -------------------------------------------
    // Remover o elemento "G" da posição 1
    // B G D E F -> posição a ser removida é 1 (G)
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]; vetor[2] = vetor[3]; vetor[3] = vetor[4]
    public void remove(int posicao) {

        if (!(posicao > 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--; //atualizar o tamanho do vetor
    }
}
