package com.loiane.estruturaDeDados.labs;

import com.loiane.estruturaDeDados.Lista;
import com.loiane.estruturaDeDados.teste.Contato;

import java.util.Scanner;

/**
 * Exercicio 6 - Contatos - Lista
 * Utilize a classe Lista ou Vetor e classe Contato (criada durante as aulas)
 * e desenvolva os seguintes itens:
 * 1 - Crie um vetor com capacidade para 20 contatos.
 * 2 - Insira 30 contatos no vetor (isso é possivel ser feito atraves de um loop);
 * Crie um exemplo para utilizar cada método da classe Lista;
 */
public class Exer06 {

    public static void main(String[] args) {

        //Criação das variaveis
        Scanner scanner = new Scanner(System.in); //leitura de dados por teclado

        //Criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);//considerado a classe Lista por ser mais completa, tem generics e pode parametrizar o tipo dos dados

        //Crfiar e adicionar 30 contatos
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
    public static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }

    public static void limparVetor(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluidos");
    }
    public static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    public static void excluirContato(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posiçao a ser removida ", scanner);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluido");
        } catch (Exception e){
            System.out.println("Posição invalida");
        }
    }

    public static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser removida ", scanner);

        try {
            lista.remove(pos);
            System.out.println("Contato excluido");
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada: ", scanner);

        try {
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);

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

    private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posiçao a ser pesquisada: ", scanner);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisaa do ultimo indice do contato encontrado: ");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado no indice: " + pos);
        } catch (Exception e){
            System.out.println("Posição invalida!");
        }
    }

    private static void obtemContato(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scanner, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scanner);
        String telefone = leInformacao("Entre com o telefone: ", scanner);
        String email = leInformacao("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista){
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformacao("Entre com o nome: ", scanner);
        String telefone = leInformacao("Entre com o telefone: ", scanner);
        String email = leInformacao("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scanner);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e){
            System.out.println("Posição invalida, contato não adicionado");
        }
    }

    private static String leInformacao(String msg, Scanner scanner){
        System.out.println(msg);
        String entrada = scanner.nextLine();

        return entrada;
    }

    private static int leInformacaoInt(String msg, Scanner scanner){
        //a entrada precisa ser um numero
        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida){

            try {
                System.out.println(msg);
                String entrada = scanner.nextLine();

                num = Integer.parseInt(entrada);
                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente!");
            }
        }
        return num;
    }


    //Dependendo do numero escolhido, irá definir a opção no menu
    private static int obterOpcaoMenu(Scanner scanner){

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while(!entradaValida){

            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adiciona contato no final do vetor");
            System.out.println("2 - Adiciona contato em uma posição especifica");
            System.out.println("3 - Obtém/busca contato de uma posição especifica");
            System.out.println("4 - Consulta/busca por contato");
            System.out.println("5 - Consulta ultimo indice do contato");
            System.out.println("6 - Verifica se contato existe/contém no vetor");
            System.out.println("7 - Excluir/remover por posição");
            System.out.println("8 - Excluir/remover contato");
            System.out.println("9 - Verifica tamanho do vetor");
            System.out.println("10 - Excluir/limpar todos os contatos do vetor");
            System.out.println("11 - Imprimir vetor");
            System.out.println("0 - Sair");

            //caso o usuario digite alguma String que nao seja numero
            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada); //transformar a String para inteiro

                if (opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                } else {
                    throw new Exception(); //lança uma excepcao
                }
            } catch (Exception e){
                System.out.println("\nEntrada inválida, digite novamente!\n\n");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){

        Contato contato;

        //Criar os contatos
        for (int i = 1; i <= quantidade; i++){

            contato = new Contato(); //reuso da variavel
            contato.setNome("Contato" + i);
            contato.setTelefone("11111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}
