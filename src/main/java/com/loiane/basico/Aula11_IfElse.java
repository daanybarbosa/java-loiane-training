package com.loiane.basico;

import java.util.Scanner;

public class Aula11_IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade");
        }
    }
}
