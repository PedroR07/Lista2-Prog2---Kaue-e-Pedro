package lista2;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        System.out.println("\nSoma das matrizes:");
        imprimirMatriz(somarMatrizes(matrizA, matrizB));

        System.out.println("\nMultiplicação das matrizes:");
        imprimirMatriz(multiplicarMatrizes(matrizA, matrizB));

        System.out.println("\nSubtração das matrizes:");
        imprimirMatriz(subtrairMatrizes(matrizA, matrizB));

        System.out.println("\nTransposta da matriz A:");
        imprimirMatriz(matrizTransposta(matrizA));
    }

    // Método para somar duas matrizes
    public static int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int M = matrizA.length;
        int N = matrizA[0].length;
        int[][] resultado = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    // Método para multiplicar duas matrizes
    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int M = matrizA.length;
        int N = matrizA[0].length;
        int[][] resultado = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        return resultado;
    }

    // Método para subtrair duas matrizes
    public static int[][] subtrairMatrizes(int[][] matrizA, int[][] matrizB) {
        int M = matrizA.length;
        int N = matrizA[0].length;
        int[][] resultado = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }

    // Método para calcular a matriz transposta
    public static int[][] matrizTransposta(int[][] matriz) {
        int M = matriz.length;
        int N = matriz[0].length;
        int[][] transposta = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        int M = matriz.length;
        int N = matriz[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}