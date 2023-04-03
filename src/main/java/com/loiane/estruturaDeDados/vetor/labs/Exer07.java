package com.loiane.estruturaDeDados.vetor.labs;

import com.loiane.estruturaDeDados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exercicio 7 - Contatos - ArrayList
 * Utilize a classe ArrayList e desenvolva os seguintes itens:
 * 1. Crie uma lista utilizando a classe ArrayList da API do Java;
 * 2. Passe todos os contatos do vetor para o ArrayList
 * 3. Crie um exemplo para utilizar cada metodo da classe ArrayList (somente
 * os metodos que implementamos de forma similar na classe Lista);
 */
public class Exer07 extends Exer06 {

    public static void main(String[] args) {

        //Criação das variaveis
        Scanner scanner = new Scanner(System.in); //leitura de dados por teclado

        //Criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<>(20);//considerado a classe ArrayList por ser mais completa, tem generics e pode parametrizar o tipo dos dados

        //Criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        //Criar um menu para que o usuário escolha a opção
        int opcao = 1;

        while (opcao != 0){
            opcao = obterOpcaoMenu(scanner);

            switch (opcao){
                case 1:
                    adicionarContatoFinal(scanner, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scanner, lista);
                    break;
                case 4:
                    obtemContato(scanner, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, lista);
                    break;
                case 7:
                    excluirPorPosicao(scanner, lista);
                    break;
                case 8:
                    excluirContato(scanner, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }

        System.out.println("Usuario digitou 0, programa terminado!");
    }

    //Métodos auxiliares
    public static void imprimirVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }

    public static void limparVetor(ArrayList<Contato> lista){
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluidos");
    }
    public static void imprimeTamanhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posiçao a ser removida ", scanner);

        try {
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluido");
        } catch (Exception e){
            System.out.println("Posição invalida");
        }
    }

    public static void excluirPorPosicao(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida ", scanner);

        try {
            lista.remove(pos);
            System.out.println("Contato excluido");
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    protected static void pesquisarContatoExiste(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

        try {
            Contato contato = lista.get(pos);
            boolean existe = lista.contains(contato);

            if (existe){
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    protected static void pesquisarUltimoIndice(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posiçao a ser pesquisada: ", scanner);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisaa do ultimo indice do contato encontrado: ");
            pos = lista.lastIndexOf(contato);
            System.out.println("Contato encontrado no indice: " + pos);
        } catch (Exception e){
            System.out.println("Posição invalida!");
        }
    }

    protected static void obtemContato(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    protected static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    protected static void adicionarContatoFinal(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scanner);
        String telefone = leInformacao("Entre com o telefone: ", scanner);
        String email = leInformacao("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    protected static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scanner);
        String telefone = leInformacao("Entre com o telefone: ", scanner);
        String email = leInformacao("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scanner);

        try {
            lista.add(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição invalida, contato não adicionado");
        }
    }

    protected static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista){

        Contato contato;

        //Criar os contatos
        for (int i = 1; i <= quantidade; i++){

            contato = new Contato(); //reuso da variavel
            contato.setNome("Contato" + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}
