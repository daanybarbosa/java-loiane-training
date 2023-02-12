package com.loiane.basico;

/*
 * \t	Tab
 * \b	Backspace
 * \n	Nova linha
 * \r	Retorno de carro
 * \f	Avanço de página
 * \’	Aspas simples
 * \”	Aspas duplas
 * \\	Barra invertida
 * \ddd	Constante octal
 */

public class Aula06_TiposPrimitivos {

    public static void main(String[] args) {

        System.out.println("------------- Inteiros -------------");

        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;

        System.out.println("Valor variavel idade01 = " + idade01);
        System.out.println("Valor variavel idade02 = " + idade02);
        System.out.println("Valor variavel idade03 = " + idade03);
        System.out.println("Valor variavel idade04 = " + idade04);

        System.out.println("------------- Ponto Flutuante -------------");

        double valorPassagem = 2.90;
        float valorTomate = 3.95f;

        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor do tomate = " + valorTomate);

        System.out.println("------------- Char -------------");
        //char o = 'o';
        //char i = 'i';

        char o = 111;
        char i = 105;
        char interrogacao = 0X003F;

        System.out.println("" + o + i + interrogacao);

        System.out.println("------------- Boolean -------------");
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("Verdadeiro = " + verdadeiro);
        System.out.println("Falso = " + falso);

        System.out.println("------------- Curiosidade Int -------------");
        int var1 = 2147483647; //limite dos numeros inteiros
        int var2 = 1;

        System.out.println(var1 + var2); //-2147483648 ira exibir os numeros negativos

        System.out.println("------------- Piadinha -------------");

        int Oct31 = 031;
        int Dec25 = 25;

        System.out.println(Oct31 == Dec25);

        System.out.println("------------- Sequencia Escape -------------");

        System.out.println("\"Hello World!\"");
        System.out.println("Hello \n World!\n");
        System.out.println("1\\4");
    }
}
