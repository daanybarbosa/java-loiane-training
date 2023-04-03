package com.loiane.estruturaDeDados.vetor;

import java.lang.reflect.Array;

// ---------------------------------------------------------------------------------------------
// ------------ Exemplo da Aula 11 - Definindo o tipo de vetor dinamicamente -------------------
// Generics
// <> - conhecido como operador "diamond" (diamante)
// T - class type (tipo da classe)
public class Lista<T> {

    //private T[] elementos; // tipo dinamico
    private T[] elementos; // tipo dinamico
    private int tamanho;

    //vetor generico
    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //refletion - API que deixa acessar dinamicamente as classes, atributos, e podemos manipular essas informações
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    // ---------------------------------------------------------------------------------------------
    // ------ Aula 03 - Adicionar o elemento no final do vetor (se tiver algum elemento null) ------
    public boolean adiciona(T elemento) {

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
    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) { //range de todas as posições que nao podem ser acessadas
            throw new IllegalArgumentException("Posicao invalida"); //argumentos invalidos
        }

        return this.elementos[posicao];
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 06 - Verificar se o elemento existe no vetor ----------------------------------------
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 07 - Adiciona elemento em qualquer posição --------------------------------
    public boolean adiciona(int posicao, T elemento) {

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
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2]; //dobrar o tamanho do vetor

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            //atribuir o novo vetor, ao vetor antigo
            this.elementos = elementosNovos;
        }
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Aula 09 - Remover elementos do vetor -------------------------------------------
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
    // ------------ Exercicio 1 - Método Contém -------------------------------------------
    //Exemplo 1
    /*public boolean contem(T elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }*/

    //Exemplo 2
    public boolean contem(T elemento){
        return busca(elemento) > -1; //>=0 - retorna true
    }

    //Exemplo 3
    /*public boolean contem(T elemento){
        int pos = busca(elemento);

        if (pos > -1){
            return true;
        }
        return false;
    }*/

    // ---------------------------------------------------------------------------------------------
    // ------------ Exercicio 2 - Método ultimoIndice ----------------------------------------------
    //Exemplo 1
    /*public int ultimoIndice(T elemento){

        int ultimaPos = -1;

        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                ultimaPos = i; //atualiza a ultima posição
            }
        }
        return ultimaPos;
    }*/

    //Exemplo 2
    /** - Para deixar o método acima mais rápido (ele irá percorrer todo o array até encontrar a ultima posição e
     * isso pode demorar dependendo do tamanho total do array)
     * - Iremos iniciar o metodo o final do array, assim que ele encontrar o elemento irá exibir a ultima posição,
     * pois ele irá inicar de trás para frente
     */
    public int ultimoIndice(T elemento){
        for (int i = this.tamanho - 1; i >= 0; i--){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Exercicio 3 - Método removeElemento --------------------------------------------
    public void remove(T elemento){
        int pos = this.busca(elemento); //ira retornar o indice ou -1 (se nao existir)
        if (pos > -1){
            this.remove(pos);
        }
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Exercicio 4 - Método obtém (get) -----------------------------------------------
    public T obtem(int posicao){
        return this.busca(posicao);
    }

    // ---------------------------------------------------------------------------------------------
    // ------------ Exercicio 5 - Método limpar todos os elementos ---------------------------------
    public void limpar(){

        //opção 1
        //this.elementos = (T[]) new Object[this.elementos.length];

        //opção 2
        //this.tamanho = 0; //resertar o tamanho para 0

        //opção 3
        for (int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null; //ira perder as referencias de todos os valores dentro do array
        }
        this.tamanho = 0;
    }
}
