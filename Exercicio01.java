import java.util.Scanner;

/*
Sabendo que o caractere especial ‘\0’ significa fim de string. Para cada situação a seguir, faça um
método que:
a) Recebe uma string e um caractere e retorne a primeira posição em que o caractere aparece. Caso o
caractere não apareça na string, deverá ser retornado o valor -1.
b) Recebe uma string e retorna 1 se não houver caracteres repetidos, 0 se houver. Lembre-se que neste caso,
cada caractere deve ser comparado com todos os outros (serão necessários 2 laços de repetição).
c) Recebe uma string e retorna o “maior” caractere. Neste caso o maior é em relação a ordem alfabética.
 */

public class Exercicio16 {

	// Método para encontrar a primeira posição de um caractere em uma string
    public static int primeiraPosicaoCaractere(String str, char caractere) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == caractere) {
                return i+1;
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado
    }

    // Método para verificar se uma string tem caracteres repetidos
    public static int caracteresRepetidos(String str) {
        boolean teste = false;
        int A = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    teste = true;
                }
            }
        }
        if(teste == true){
            A = 1;
        }
        else{
            A = 2;
        }
        return A;
    }


    // Método para encontrar o "maior" caractere em uma string (ordem alfabética)
    public static char maiorCaractere(String str) {
        char maior = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > maior) {
                maior = str.charAt(i);
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a string: ");
        String texto = sc.nextLine();
        System.out.println("Insira uma letra: ");

        // Teste do método primeiraPosicaoCaractere
        char caractereBuscado = sc.next().charAt(0);
        int posicao = primeiraPosicaoCaractere(texto, caractereBuscado);
        System.out.println("A primeira posição do caractere '" + caractereBuscado + "' na string é: " + posicao);

        // Teste do método caracteresRepetidos
        int resultado = caracteresRepetidos(texto);
        if(resultado == 2){
            System.out.println("A string possui caracteres repetidos? Não" );
        }
        else{
            if(resultado == 1){
            System.out.println("A string possui caracteres repetidos? Sim" );
        }
    }
        // Teste do método maiorCaractere
        char maiorCaractere = maiorCaractere(texto);
        System.out.println("O maior caractere na string em relação à ordem alfabética é: " + maiorCaractere);
    }
}
