package lista2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio011 {

	
	 // Método para gerar uma imagem aleatória
    public static void geraImagem(int altura, int largura) {
        
        Random aleatório = new Random(); // Cria um objeto da classe Random para gerar números aleatórios
        
        for(int i = 0; i < altura; i++) { // Loop externo para controlar as linhas da imagem
            for(int j = 0; j < largura; j++) { // Loop interno para controlar os caracteres em cada linha
                int numaleat = aleatório.nextInt(4); // Gera um número aleatório entre 0 (inclusive) e 4 (exclusivo)
                
                if (numaleat == 0) { // Se o número aleatório for igual a 0
                    System.out.print(' '); // Imprime um espaço em branco
                } else {
                    System.out.print('*'); // Caso contrário, imprime um asterisco
                }
            }
            System.out.println(); // Pula para a próxima linha após cada linha de largura
        }
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); // Cria um objeto da classe Scanner para leitura de entrada
        
        int altura = 0;
        int largura = 0;
        
        System.out.println("Informe a altura: "); // Solicita ao usuário que informe a altura da imagem
        altura = ler.nextInt(); // Lê a altura fornecida pelo usuário
        System.out.println("Informe a largura: "); // Solicita ao usuário que informe a largura da imagem
        largura = ler.nextInt(); // Lê a largura fornecida pelo usuário
        
        geraImagem(altura, largura); // Chama o método geraImagem para criar a imagem com as dimensões fornecidas
    }   
}
