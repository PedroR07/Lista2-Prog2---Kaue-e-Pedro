import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        String[][] Matriz = new String[41][41];
        int Raio, CentX, CentY;
        Raio = 20;
        CentX = 20;
        CentY = 20;
        circulo(Matriz, Raio, CentX, CentY);
        JOptionPane.showMessageDialog(null, circuloExt(Matriz));
    }
    public static void circulo(String A[][], int Raio, int CentX, int CentY){
        int distCent;
        for(int i = 0; i < 41; i++){
            for(int j = 0; j < 41; j++){
                distCent = ((i - CentX) * (i - CentX)) + ((j - CentY) * (j - CentY));
                if(distCent <= Raio * Raio){
                    A[i][j] = "● ";
                }
                else{
                    A[i][j] = "○ " ;
                }
            }
        }
        
    }
    public static String circuloExt(String A[][]) {
        String Mat = "";
        for (int i = 0; i < 41; i++) {
            Mat += "\n";
            for (int j = 0; j < 41; j++) {
                Mat += A[i][j] + "  ";
            }
            
        }
        return Mat;
    }
}
