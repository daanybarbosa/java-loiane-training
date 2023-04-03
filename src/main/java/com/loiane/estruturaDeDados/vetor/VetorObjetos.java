package com.loiane.estruturaDeDados.vetor;

// ---------------------------------------------------------------------------------------------
// ------------ Aula 10 - Generalizando o tipo do vetor ----------------------------------------

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade]; //inicializar o vetor
        this.tamanho = 0; //inicializar a variavel
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
