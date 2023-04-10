package com.loiane.estruturaDeDados.vetor;

import com.loiane.estruturaDeDados.base.EstruturaEstatica;

/**
 * Classe Lista2 refactoring da classe Lista (@see Lista)
 * @param <T>
 */
public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(){
        super();
    }

    public Lista2(int capacidade){
        super(capacidade); //construtor da super classe
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}
