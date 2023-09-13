import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int [][] A = new int [20][20];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira 16 valores: "));
            }
        }
        JOptionPane.showMessageDialog(null, "Maior Valor: " + maiorValor(A) + "\nMenor Valor: " + menorValor(A) + "\nMédia dos Valores: " + mediaValores(A) + "\nDiagonal Principal: " + diagPrinc(A) + "\nDesvio Padrão: " + desvioPadrão(A));
        JOptionPane.showMessageDialog(null, "Matriz:\n" + matExt(A));
        JOptionPane.showMessageDialog(null, "Matriz Normalizada:\n" + matNorm(A));
    }
    public static int maiorValor(int A[][]){
        int n = -999999999;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(A[i][j] > n){
                    n = A[i][j];
                }
            }
        }
        return n;
    }
    public static int menorValor(int A[][]){
        int n = 999999999;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(A[i][j] < n){
                    n = A[i][j];
                }
            }
        }
        return n;
    }
    public static Double mediaValores(int A[][]){
        double n = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                n += A[i][j];
            }
        }
        n = n / 16;
        return n;
    }
    public static String matExt(int A[][]){
        String n = "";
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j == 3){
                    n += Integer.toString(A[i][j]) + "\n";
                }
                else{
                    n += Integer.toString(A[i][j]) + " - ";
                }
            }
        }
        return n;
    }
    public static String diagPrinc(int A[][]){
        String n = "";
        for(int i = 0; i < 4; i++){
            if(i == 3){
                n += Integer.toString(A[i][i]);
            }
            else{
            n += Integer.toString(A[i][i]) + " - ";
            }
        }
        return n;
    }
    public static Double desvioPadrão(int A[][]){
        double DP = 0, media = mediaValores(A), variancia = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                variancia += Math.pow(A[i][j] - media, 2);
            }
        }
        variancia = variancia / 16;
        DP = Math.pow(variancia, 2);
        return DP;
    }
    public static String matNorm(int A[][]){
        double[][] B = new double[20][20];
        String matrizNormalizada = "";
        double C = menorValor(A);
        double D = maiorValor(A);
        double E = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                E = A[i][j] - C;
                B[i][j] = (E / D);
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j == 3){
                    matrizNormalizada += Double.toString(B[i][j]) + "\n";
                }
                else{
                    matrizNormalizada += Double.toString(B[i][j]) + " - ";
                }
            }
        }
        return matrizNormalizada;
    }
}
