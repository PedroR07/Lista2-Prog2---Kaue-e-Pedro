package lista2;

public class Exercicio09 {

	public static void main(String[] args) {
        int tamanho = 5; // Tamanho da matriz
        char[][] matriz = new char[tamanho][tamanho]; // Cria uma matriz quadrada

        // Preenche a matriz com espaços em branco
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Chama o método quadrado para preencher o quadrado na matriz
        quadrado(matriz, 1, 1, 3, 3);

        // Imprime a matriz resultante
        imprimirMatriz(matriz);
    }

    // Método para preencher um quadrado na matriz com "*"
    public static void quadrado(char[][] matriz, int linhaInicio, int colunaInicio, int linhaFim, int colunaFim) {
        // Verifica se os índices de início e fim estão dentro dos limites da matriz
        if (linhaInicio < 0 || colunaInicio < 0 || linhaFim >= matriz.length || colunaFim >= matriz[0].length) {
            throw new IllegalArgumentException("Índices fora dos limites da matriz.");
        }

        // Preenche o quadrado com "*"
        for (int i = linhaInicio; i <= linhaFim; i++) {
            for (int j = colunaInicio; j <= colunaFim; j++) {
                matriz[i][j] = '*';
            }
        }
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}