import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        int[][] Circulo = new int[41][41];
        int[][] Quadrado = new int[41][41];
        int[][] Aleatoria = new int[41][41];
        int[][] somaQuadCir = new int[41][41];
        int[][] somaAleatCirc = new int[41][41];
        int[][] interQuadCir = new int[41][41];
        int[][] interAleatCir = new int[41][41];
        int Raio, CentX, CentY;
        Raio = 20;
        CentX = 20;
        CentY = 20;
        circulo(Circulo, Raio, CentX, CentY);
        quadrado(Quadrado);
        aleatorio(Aleatoria);
        soma(Circulo, Quadrado, somaQuadCir);
        soma(Aleatoria, Circulo, somaAleatCirc);
        intersec(Quadrado, Circulo, interQuadCir);
        intersec(Aleatoria, Circulo, interAleatCir);
        JOptionPane.showMessageDialog(null, "Ordem das Matrizes: \n1- Círculo. \n2- Quadrado. \n3- Aleatório. \n4- Soma de Quadrado e Círculo. \n5- Soma de Aleatório e Círculo. \n6- Intersecção Quadrado e Círculo. \n7- Intersecção Aleatório e Círculo.");
        JOptionPane.showMessageDialog(null, matExt(Circulo));
        JOptionPane.showMessageDialog(null, matExt(Quadrado));
        JOptionPane.showMessageDialog(null, matExt(Aleatoria));
        JOptionPane.showMessageDialog(null, matExt(somaQuadCir));
        JOptionPane.showMessageDialog(null, matExt(somaAleatCirc));
        JOptionPane.showMessageDialog(null, matExt(interQuadCir));
        JOptionPane.showMessageDialog(null, matExt(interAleatCir));
    }
    public static void circulo(int A[][], int Raio, int CentX, int CentY){
        int distCent;
        for(int i = 0; i < 41; i++){
            for(int j = 0; j < 41; j++){
                distCent = ((i - CentX) * (i - CentX)) + ((j - CentY) * (j - CentY));
                if(distCent <= Raio * Raio){
                    A[i][j] = 4;
                }
                else{
                    A[i][j] = 0;
                }
            }
        }
        
    }
    public static void quadrado(int A[][]){
        for(int i = 3; i < 38; i++){
            for(int j = 3; j < 38; j++){
                A[i][j] = 4;
            }
        }
    }
    public static void aleatorio(int A[][]){
        Random aleatorio = new Random();
        for(int i = 0; i < 41; i++){
            for( int j = 0; j < 41; j++){
                A[i][j] = aleatorio.nextInt(9);
            }
        }
    }
    public static void soma(int[][] A, int B[][], int C[][]){
        for(int i = 0; i < 41; i++){
            for(int j = 0; j < 41; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }
    public static void intersec(int A[][], int B[][], int C[][]){
        for(int i = 0; i < 41; i++){
            for(int j = 0; j < 41; j++){
                if(A[i][j] == B[i][j]){
                    C[i][j] = A[i][j];
                }
            }
        }
    }
    public static String matExt(int A[][]) {
        String Mat = "";
        for (int i = 0; i < 41; i++) {
            Mat += "\n";
            for (int j = 0; j < 41; j++) {
                Mat += A[i][j] + "     ";
            }
            
        }
        return Mat;
    }
}