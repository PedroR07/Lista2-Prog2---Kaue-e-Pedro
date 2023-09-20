package lista2;

import java.util.Scanner;

public class Exercicio15 {

    // Método para encontrar a primeira posição de um caractere em uma string
    public static int primeiraPosicaoCaractere(String str, char caractere) {
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == caractere) {
                    return i;
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Erro: A string é nula.");
        }
        return -1; // Retorna -1 se o caractere não for encontrado ou se a string for nula
    }

    // Método para verificar se uma string tem caracteres repetidos
    public static int caracteresRepetidos(String str) {
        try {
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        return 0; // Encontrou caracteres repetidos, retorna 0
                    }
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Erro: A string é nula.");
        }
        return 1; // Não encontrou caracteres repetidos ou a string é nula, retorna 1
    }

    // Método para encontrar o "maior" caractere em uma string (ordem alfabética)
    public static char maiorCaractere(String str) {
        try {
            if (str.length() == 0) {
                throw new IllegalArgumentException("A string está vazia.");
            }

            char maior = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) > maior) {
                    maior = str.charAt(i);
                }
            }
            return maior;
        } catch (NullPointerException e) {
            System.err.println("Erro: A string é nula.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        return '\0'; // Retorna caractere nulo se ocorrer um erro
    }

    public static void main(String[] args) {
        String texto = "exemplo";

        // Teste do método primeiraPosicaoCaractere
        char caractereBuscado = 'm';
        int posicao = primeiraPosicaoCaractere(texto, caractereBuscado);
        System.out.println("A primeira posição do caractere '" + caractereBuscado + "' na string é: " + posicao);

        // Teste do método caracteresRepetidos
        String texto2 = "repeticao";
        int resultado = caracteresRepetidos(texto2);
        System.out.println("A string possui caracteres repetidos? " + (resultado == 0 ? "Sim" : "Não"));

        // Teste do método maiorCaractere
        char maiorCaractere = maiorCaractere(texto);
        if (maiorCaractere != '\0') {
            System.out.println("O maior caractere na string em relação à ordem alfabética é: " + maiorCaractere);
        } else {
            System.out.println("Não foi possível determinar o maior caractere.");
        }
    }
}