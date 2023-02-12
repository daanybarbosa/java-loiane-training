package com.loiane.basico;

import java.util.Scanner;

/**
 * Lendo uma linha inteira
 * String nome = scan.nextLine();
 *
 * Lendo um tipo específico
 * String primeiroNome = scan.next();
 * int idade = scan.nexInt();
 * double altura = scan.nextDouble();
 */
public class Aula07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine(); //lendo a linha completa
        System.out.println("Seu nome completo é: "+ nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next(); //lendo o primeira String
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt(); //lendo um inteiro
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);
         */

        System.out.println("Digite seu primeiro nome, idade, qtde de filhos, altura e se tem animal de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdeFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes valores: ");
        System.out.println("Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Qtde de filhos: " + qtdeFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem pet: " + temPet);
    }
}
