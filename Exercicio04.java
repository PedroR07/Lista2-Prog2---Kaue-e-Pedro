import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        int n, k;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de linhas da Matriz: "));
        k = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de colunas da Matriz: "));
        int[][] Mat = new int[n][k];
        preencherMatriz(Mat);
    }
    public static void preencherMatriz(int A[][]){
        int[][] cont = new int [64][2];
        boolean encontrado = false;
        for(int i = 0; i < 64; i++){
            cont[i][0] = i;
            cont[i][1] = 0;
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha sua matriz: "));
                for(int k = 0; k < 64; k++){
                    if(A[i][j] == cont[k][0]){
                        cont[k][1]++;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    for(int l = 0; l < 64; l++){
                        if(cont[l][0] == 0){
                            cont[l][0] = A[i][j];
                            cont[l][1] = 1;
                            break;
                        }
                    }
            }
            }
        }
        JOptionPane.showMessageDialog(null, matExt(cont));
    }
    public static String matExt(int A[][]){
        String B = "";
        String C, D;
        for(int i = 0; i < 64; i++){
            if (A[i][1] != 0) {
                C = Integer.toString(A[i][0]);
                D =Integer.toString(A[i][1]);
                B += ("Valor: " + C + ": " + D + " ocorrência(s)\n");
            }
        }
        return B;
    }
}
