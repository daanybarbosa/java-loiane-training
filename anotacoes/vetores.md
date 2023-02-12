# Vetores (Arrays)

## Introduçào
- Classe Vetor
  - Definição
  - Adicionar elemento no final do vetor
  - Verificar quantidade de elementos no vetor
  - Imprimir elementos do vetor
  - Obter elemento de uma posição
  - Verificar se elemento existe no vetor
  - Adicionar elemento em qualquer posição
  - Adicionar mais capacidade ao vetor
  - Remover elemento do vetor
  - Generalizar o tipo dos elementos
  - Definindo o tipo do vetor dinamicamente
  - API Java ArrayList
  - Exercicios

"Um vetor (ou array) é a estrutura de dados mais simples que existe.
Um vetor armazena uma sequência de valores onde todos são do mesmo tipo."
-- Loiane Groner (Learning JavaScript Data Structures and Algorithms)

## Exemplos
#### Armazenar temperaturas
double tempDia001 = 31.3; <br>
double tempDia002 = 32; <br>
double tempDia003 = 33.7; <br>
double tempDia004 = 34; <br>
double tempDia005 = 33.1; <br>

#### Armazenar temperaturas em um vetor
double[] temperaturas = new Double[365];
temperaturas[0] = 31.3;
temperaturas[1] = 32;
temperaturas[2] = 33.7;
temperaturas[3] = 34;
temperaturas[4] = 33.1;