import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de linhas das matrizes: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de linhas das matrizes: "));
        int[][] A = new int[n][y];
        int[][] B = new int[n][y];
        int[][] C = new int[n][y];
        preencherMatrizes(A, B);
        intersecaoImagens(A, B, C);
        JOptionPane.showMessageDialog(null, "Interseção: \n" + matExt(C));
    }
    
    
    public static void preencherMatrizes(int A[][], int B[][]){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz A: "));
            }
        }
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B[i].length; j++){
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Preencha a matriz B: "));
            }
        }
    }
    
    
    public static void intersecaoImagens(int A[][], int B[][], int C[][]){
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[i].length; j++){
                if(A[i][j] == B[i][j]){
                    C[i][j] = A[i][j];
                }
                else{
                    C[i][j] = 0;
                }
            }
        }
    }
    
    
    public static String matExt (int A[][]){
        String B = "";
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                if(j > 0 & j / A.length == 0){
                    B = Integer.toString(A[i][j]) + "\n";
                }
                else{
                    B = Integer.toString(A[i][j]);
                }
            }
        }
        return B;
    }
}
