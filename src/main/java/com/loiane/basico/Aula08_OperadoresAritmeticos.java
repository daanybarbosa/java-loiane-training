package com.loiane.basico;

/**
 * OPERADORES
 *
 * Operador	Descrição
 *  +	Adição (e mais unário)
 *  -	Subtração (e menos unário)
 *  *	Multiplicação
 *  /	Divisão
 *  %	Modulo
 *  ++	Incremento (pós ou pré fix)
 *  --	Decremento (pós e pre fix)
 */

public class Aula08_OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++); //depois - primeiro ira exibir o resultado e depois ira incrementar
        //Mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;

        System.out.println(++resultado); //antes - primeiro incrementa e depois exibe o resultado
        //Mesma coisa que
        //resultado += 1;
        //System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        //Mesma coisa que
        //System.out.println(resultado);
        //resultado = resultado - 1;
        //resultado -= 1;

        System.out.println(--resultado);
        //Mesma coisa que
        //resultado -= 1;
        //System.out.println(resultado);
    }
}
