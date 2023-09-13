package lista2;

public class Exercicio07 {

	 public static void main(String[] args) {
	        // Define duas matrizes de caracteres (imagens) A e B
	        char[][] matrizA = {
	            {'A', 'B', 'C'},
	            {'D', 'E', 'F'},
	            {'G', 'H', 'I'}
	        };

	        char[][] matrizB = {
	            {'1', '2', '3'},
	            {'4', '5', '6'},
	            {'7', '8', '9'}
	        };

	        // Cria uma matriz vazia C para armazenar o resultado da soma
	        char[][] matrizC = new char[3][3];

	        // Chama o método somaImagens para somar as matrizes A e B, armazenando o resultado em C
	        somaImagens(matrizA, matrizB, matrizC);

	        // Imprime a matriz resultante C
	        for (int i = 0; i < matrizC.length; i++) {
	            for (int j = 0; j < matrizC[i].length; j++) {
	                System.out.print(matrizC[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    // Método para somar duas matrizes de caracteres A e B e armazenar o resultado em C
	    public static void somaImagens(char[][] matrizA, char[][] matrizB, char[][] matrizC) {
	        int linhas = matrizA.length;
	        int colunas = matrizA[0].length;

	        // Verifica se as matrizes têm o mesmo tamanho
	        if (matrizB.length != linhas || matrizB[0].length != colunas || matrizC.length != linhas || matrizC[0].length != colunas) {
	            throw new IllegalArgumentException("As matrizes devem ter o mesmo tamanho");
	        }

	        // Realiza a soma dos caracteres de A e B e armazena em C
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matrizC[i][j] = somarCaracteres(matrizA[i][j], matrizB[i][j]);
	            }
	        }
	    }

	    // Método para somar dois caracteres e retornar o resultado
	    public static char somarCaracteres(char a, char b) {
	        // Implemente aqui a lógica de soma dos caracteres conforme a tabela
	        // Exemplo: Se a = 'A' e b = '1', o resultado deve ser 'B'
	        // Você pode usar operações de cast para converter os caracteres em números e vice-versa
	        // Lembre-se de tratar os casos especiais, como quando a soma ultrapassa 'Z' ou '9'
	        // e precisa voltar ao começo da tabela de caracteres.

	        // Exemplo simplificado:
	        int soma = (a - 'A') + (b - '1'); // Converte os caracteres em números e realiza a soma
	        char resultado = (char) ('A' + (soma % 26)); // 26 é o número de letras no alfabeto
	        return resultado;
	    }
	}