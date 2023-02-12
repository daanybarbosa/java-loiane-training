package com.loiane.basico;

public class Aula05_Variaveis {

    public static void main(String[] args) {

        //boas praticas do Java
        //Conversão Java
        int idade;
        int idade2 = 20;
        String nome;
        String nome2 = "Loiane";
        String nomeDoMeuCachorro;
        String nomeDoMeuCachorro2 = "totó";
        String ano2014;

        //Aceito, mas nao utilizado
        //Nao sao boas praticas do Java
        int _idade;
        int $idade;

        //Não é conversão Java
        String nome_do_meu_cachorro;

        idade = 25;

        System.out.println(idade);
        System.out.println(idade2);
        System.out.println(nome2);
        System.out.println(nomeDoMeuCachorro2);

        // má pratica
        //tentar utilizar nomes que significam algo
        int a = 10;
        String b = "Loiane";
    }
}
