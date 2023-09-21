import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args) throws Exception {
        int n, k;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de linhas da Matriz: "));
        k = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de colunas da Matriz: "));
        int[][] Mat = new int[n][k];
        preencherMatriz(Mat);
    }
    public static void preencherMatriz(int A[][]){
        // Inicializa uma matriz "cont" de 64 linhas e 2 colunas
        // onde cada linha representa um número e seu contador de ocorrências.
        int[][] cont = new int [64][2];
        boolean encontrado = false; // Flag para indicar se o número foi encontrado na matriz "cont"
        // Inicializa a matriz "cont" com números de 0 a 63 e seus contadores como 0
        for(int i = 0; i < 64; i++){
            cont[i][0] = i;
            cont[i][1] = 0;
        }
    
        // Percorre as linhas da matriz A
        for(int i = 0; i < A.length; i++){
            // Percorre as colunas da matriz A
            for(int j = 0; j < A[i].length; j++){
                // Solicita ao usuário um valor para preencher a matriz A
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha sua matriz: "));
    
                // Compara o valor inserido com os números da matriz "cont"
                for(int k = 0; k < 64; k++){
                    if(A[i][j] == cont[k][0]){
                        cont[k][1]++; // Incrementa o contador se o número for encontrado
                        encontrado = true;
                        break; // Sai do loop, pois o número já foi encontrado
                    }
                }
    
                // Se o número não foi encontrado na matriz "cont", ele é adicionado
                if (!encontrado) {
                    for(int l = 0; l < 64; l++){
                        if(cont[l][0] == 0){
                            cont[l][0] = A[i][j]; // Adiciona o número
                            cont[l][1] = 1; // Inicializa o contador como 1
                            break;
                        }
                    }
                }
                encontrado = false; // Reseta a flag para a próxima iteração
            }
        }
    
        // Chama a função matExt para exibir a matriz "cont" e exibe o resultado em um JOptionPane
        JOptionPane.showMessageDialog(null, printOcorr(cont));
    }
    public static String printOcorr(int A[][]){
        String B = "";
        String C, D;
        for(int i = 0; i < 64; i++){
            if (A[i][1] != 0) {
                C = Integer.toString(A[i][0]);
                D = Integer.toString(A[i][1]);
                B += (C + ": " + D + " ocorrência(s)\n");
            }
        }
        return B;
    }
}
