package com.loiane.basico;

/**
 * Operador	Descrição
 * ==	Igual a
 * != 	Diferente de
 * >	Maior que
 * < 	Menor que
 * >= 	Maior ou igual que
 * <=	Menor ou igual que
 */
public class Aula09_OperadoresRelacionais {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        System.out.println("valor1 == valor2: " + (valor1 == valor2));
        System.out.println("valor1 != valor2: " + (valor1 != valor2));
        System.out.println("valor1 > valor2: " + (valor1 > valor2));
        System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
        System.out.println("valor1 < valor2: " + (valor1 < valor2));
        System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
    }
}
