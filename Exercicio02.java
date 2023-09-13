package lista2;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int M[][] = new int[20][20];

        // Solicita que o usuário insira elementos nas primeiras 4 linhas e 4 colunas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Insira um elemento para a linha " + (i + 1) + " coluna " + (j + 1) + ": ");
                M[i][j] = ler.nextInt();
            }
        }

        // Preenche o restante da matriz com zeros
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (i >= 4 || j >= 4) {
                    M[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz resultante:");
        imprimirMatriz(M);

        ler.close();
    }

    // Método para retornar o maior valor em uma submatriz MxN
    public static int maiorValor(int[][] matriz, int M, int N) {
        int maior = matriz[0][0];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    // Método para retornar o menor valor em uma submatriz MxN
    public static int menorValor(int[][] matriz, int M, int N) {
        int menor = matriz[0][0];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    // Método para retornar a média dos valores em uma submatriz MxN
    public static double mediaValores(int[][] matriz, int M, int N) {
        int soma = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                soma += matriz[i][j];
            }
        }
        return (double) soma / (M * N);
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}