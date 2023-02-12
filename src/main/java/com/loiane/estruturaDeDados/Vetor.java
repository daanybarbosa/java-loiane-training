package com.loiane.estruturaDeDados;

import java.util.Arrays;

public class Vetor {

    private String[] elementos; //todos os elementos do vetor
    private int tamanho; //ira controlar o tamanho real do vetor

    // ---------------------------------------------------------------------------------------------
    // ------ Aula 02 - Introdução -----------------------------------------------------------------
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade]; //inicializar o vetor
        this.tamanho = 0; //inicializar a variavel
    }

    // ---------------------------------------------------------------------------------------------
    // ------ Aula 03 - Adicionar o elemento no final do vetor (se tiver algum elemento null) ------
    /*public void adiciona(String elemento){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break; //ira parar na primeira posição nula
            }
        }
    }*/

    //Adiciona o elemento no final do vetor, caso ultrapasse a qtde do vetor irá lançar uma exception
    /*public void adiciona(String elemento) throws Exception {
        //verificar se o tamanho é menor que a capacidade de elemento no vetor
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor ja esta cheio, nao é possivel adicionar mais elementos");
        }
    }*/


    public boolean adiciona(String elemento) {

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

    //imprimir os elementos do vetor
    public String toString() {

        //EXEMPLO - SEM STRINGBUILDER
        //apenas exibir os elementos adicionados no vetor (sem as posições nulas)
        //ira iterar todos os elementos do vetor e adicionar na String
        /*String s = "[";
        for (int i=0; i<this.tamanho -1; i++){
            s += this.elementos[i];
            s += ", ";
        }
        if(this.tamanho > 0){
            s += this.elementos[this.tamanho -1];
        }
        String s = "]";
        return Arrays.toString(elementos);
         */

        //EXEMPLO - COM STRINGBUILDER
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
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) { //range de todas as posições que nao podem ser acessadas
            throw new IllegalArgumentException("Posicao invalida"); //argumentos invalidos
        }

        return this.elementos[posicao];
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 06 - Verificar se o elemento existe no vetor ----------------------------------------
    /*public boolean busca(String elemento){
        //busca sequencial - vai em posição em posição e procura o elemento que estamos buscando
        for (int i=0; i< this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    } */

    public int busca(String elemento) {
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
    // Inserir "A" na posição 0 do vetor
    // Para isso o vetor irá mover o vetor[4] para posição 5 e assim por diante.
    // vetor[5] = vetor[4]; vetor[4] = vetor[3]; vetor[3] = vetor[2]; vetor[2] = vetor[1]; vetor[1] = vetor[0]; vetor[0] = "A";

    //overloading - sobrecarregar o metodo adiciona modificando a sua assinatura
    public boolean adiciona(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        //mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) { //iterando o vetor de trás para frente
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 08 - Aumentar capacidade ao vetor -----------------------------------------
    // Aumentar o vetor dinamicamente, de acordo com a necessidade
    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {

            //declarar um novo vetor
            String[] elementosNovos = new String[this.elementos.length * 2]; //dobrar o tamanho do vetor

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

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 11 - Definindo o tipo de vetor dinamicamente ------------------------------



}
