import javax.swing.JOptionPane;
public class Exercicio13 {
    public static void main(String[] args) {
        String[][] A = new String[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                A[i][j] = "/0";
            }
        }
        preencheMatriz(A);
    }
    public static void preencheMatriz(String A[][]){
        int x, y, z = 0;
        for(int i = 0; i < 8; i++){
            while(z == 0){
                x = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador X) Insira a linha:")) - 1;
                y = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador X) Insira a coluna:")) - 1;
                    if(A[x][y] != "/0"){
                        JOptionPane.showMessageDialog(null, "Posição ocupada. Selecione outra.");
                    }
                    else{
                        A[x][y] = "X";
                        z = 1;
                    }
                }
                z = 0;
                if(verificadorGanhador(A) == 1){
                    JOptionPane.showMessageDialog(null, "O jogador X venceu!");
                    return;
                }
                if(verificadorGanhador(A) == 0){
                    JOptionPane.showMessageDialog(null, "Velha!");
                    return;
                }
                
            while(z == 0){
                x = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador O) Insira a linha:")) - 1;
                y = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador O) Insira a coluna:")) - 1;
                    if(A[x][y] != "/0"){
                        JOptionPane.showMessageDialog(null, "Posição ocupada. Selecione outra.");
                    }
                    else{
                        A[x][y] = "O";
                        z = 1;
                    }
            }
                z = 0;
                if(verificadorGanhador(A) == 2){
                    JOptionPane.showMessageDialog(null, "O jogador O venceu!");
                    return;
                }
        }
        if(verificadorGanhador(A) == 4){
                    JOptionPane.showMessageDialog(null, "Velha!");
                    return;
                }
    }
    public static String matExt(String A[][]){
        String B = "";
        for(int i = 0; i < 3; i++){
            B += "\n";
            for(int j = 0; j < 3; j++){
                B += A[i][j] + "  ";
            }
        }
        return B;
    }
    public static int verificadorGanhador(String A[][]){
        int Vencedor = 4, Velha = 0;
        //X: verificar diagonais primeiro;
        if((A[0][0] == "X" && A[1][1] == "X" && A[2][2] =="X") || (A[0][2] == "X" && A[1][1] == "X" && A[2][0] =="X")){
            Vencedor = 1;
            return Vencedor;
        }
        //X: verificar colunas;
        if((A[0][0] == "X" && A[1][0] == "X" && A[2][0] =="X") || (A[0][1] == "X" && A[1][1] == "X" && A[2][1] =="X") || (A[0][2] == "X" && A[1][2] == "X" && A[2][2] =="X")){
            Vencedor = 1;
            return Vencedor;
        }
        //X: verificar linhas;
        if((A[0][0] == "X" && A[0][1] == "X" && A[0][2] =="X") || (A[1][0] == "X" && A[1][1] == "X" && A[1][2] =="X") || (A[2][0] == "X" && A[2][1] == "X" && A[2][2] =="X")){
            Vencedor = 1;
            return Vencedor;
        }

        //O: verificar diagonais primeiro;
        if((A[0][0] == "O" && A[1][1] == "O" && A[2][2] =="O") || (A[0][2] == "O" && A[1][1] == "O" && A[2][0] =="O")){
            Vencedor = 2;
            return Vencedor;
        }
        //O: verificar colunas;
        if((A[0][0] == "O" && A[1][0] == "O" && A[2][0] =="O") || (A[0][1] == "O" && A[1][1] == "O" && A[2][1] =="O") || (A[0][2] == "O" && A[1][2] == "O" && A[2][2] =="O")){
            Vencedor = 2;
            return Vencedor;
        }
        //O: verificar linhas;
        if((A[0][0] == "O" && A[0][1] == "O" && A[0][2] =="O") || (A[1][0] == "O" && A[1][1] == "O" && A[1][2] =="O") || (A[2][0] == "O" && A[2][1] == "O" && A[2][2] =="O")){
            Vencedor = 2;
            return Vencedor;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(A[i][j] != "/0"){
                    Velha++;
                }
            }
        }
        if(Velha == 9){
            Vencedor = 0;
        }
        return Vencedor;
    }
}
