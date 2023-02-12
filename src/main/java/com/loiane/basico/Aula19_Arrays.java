package com.loiane.basico;

public class Aula19_Arrays {

    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        //Acessar posição X do array
        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);

        //Obter o tamanho do array
        System.out.println("O tamanho do array: " + temperaturas.length);

        //Iterar todos os elementos do array com for
        for (int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia: " + (i + 1) + " é: " + temperaturas[i]);
        }

        //Iterar todos os elementos com foreach (for melhorado)
        for (double temp:temperaturas){
            System.out.println(temp);
        }
    }
}
