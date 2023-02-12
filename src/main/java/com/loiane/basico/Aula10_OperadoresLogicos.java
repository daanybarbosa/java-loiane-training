package com.loiane.basico;

/**
 * OPERADORES LOGICOS
 *
 * Operador	Descrição
 * &	AND
 * |	OR
 * ^	XOR
 * ||	OR curto-circuito
 * &&	AND curto-circuito
 * !	NOT
 */
public class Aula10_OperadoresLogicos {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println(resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println(resultado2);

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro || falso);

        //curto-circuito
        boolean verdadeiro1 = true;
        boolean falso1 = false;
        boolean resultado3 = falso & verdadeiro;
        boolean resultado4 = falso && verdadeiro; //curto-circuito
        System.out.println(resultado3);
        System.out.println(resultado4);

        //precedência
        int resultado5 = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado5);
    }
}
