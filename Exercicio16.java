import javax.swing.JOptionPane;
public class Exercicio13 {
    public static void main(String[] args) {
        String[][] A = new String[3][3];
        int N = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                A[i][j] = "/0";
            }
        }
        while(N == 0){
        try{
        N = preencheMatriz(A);
        }
        catch(NumberFormatException erro){
            N = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor inválido! \nDigite 1 para sair. \nDigite 0 para continuar."));
            }
        }
    }
    public static int preencheMatriz(String A[][]) {
        int x, y, z = 0;
        int L = 1;
        for (int i = 0; i < 8; i++) {
            while (z == 0) {
                try {
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador X) Insira a linha:")) - 1;
                    y = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador X) Insira a coluna:")) - 1;
                    if (!A[x][y].equals("/0")) {
                        throw new IllegalArgumentException();
                    } else {
                        A[x][y] = "X";
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException error1) {
                    z = Integer.parseInt(JOptionPane.showInputDialog(null, "Posição ocupada ou valor inválido. \nDigite 0 para tentar novamente. \nDigite 1 para terminar o seu turno."));
    
                    if (z == 1) {
                        break;
                    }
                }
            }
    
            z = 0;
    
            if (verificadorGanhador(A) == 1) {
                JOptionPane.showMessageDialog(null, "O jogador X venceu!");
                return L;
            }
    
            if (verificadorGanhador(A) == 0) {
                JOptionPane.showMessageDialog(null, "Velha!");
                return L;
            }
    
            while (z == 0) {
                try {
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador O) Insira a linha:")) - 1;
                    y = Integer.parseInt(JOptionPane.showInputDialog(null, matExt(A) + "\n(Jogador O) Insira a coluna:")) - 1;
                    if (!A[x][y].equals("/0")) {
                        throw new IllegalArgumentException();
                    } else {
                        A[x][y] = "O";
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException error1) {
                    z = Integer.parseInt(JOptionPane.showInputDialog(null, "Posição ocupada ou valor inválido. \nDigite 0 para tentar novamente. \nDigite 1 para terminar o seu turno."));
    
                    if (z == 1) {
                        break;
                    }
                }
            }
    
            z = 0;
    
            if (verificadorGanhador(A) == 2) {
                JOptionPane.showMessageDialog(null, "O jogador O venceu!");
                return L;
            }
        }
    
        if (verificadorGanhador(A) == 4) {
            JOptionPane.showMessageDialog(null, "Velha!");
            return L;
        }
        return L;
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

        if((A[0][0] == "X" && A[1][1] == "X" && A[2][2] =="X") || (A[0][2] == "X" && A[1][1] == "X" && A[2][0] =="X")){
            Vencedor = 1;
            return Vencedor;
        }

        if((A[0][0] == "X" && A[1][0] == "X" && A[2][0] =="X") || (A[0][1] == "X" && A[1][1] == "X" && A[2][1] =="X") || (A[0][2] == "X" && A[1][2] == "X" && A[2][2] =="X")){
            Vencedor = 1;
            return Vencedor;
        }

        if((A[0][0] == "X" && A[0][1] == "X" && A[0][2] =="X") || (A[1][0] == "X" && A[1][1] == "X" && A[1][2] =="X") || (A[2][0] == "X" && A[2][1] == "X" && A[2][2] =="X")){
            Vencedor = 1;
            return Vencedor;
        }

        if((A[0][0] == "O" && A[1][1] == "O" && A[2][2] =="O") || (A[0][2] == "O" && A[1][1] == "O" && A[2][0] =="O")){
            Vencedor = 2;
            return Vencedor;
        }

        if((A[0][0] == "O" && A[1][0] == "O" && A[2][0] =="O") || (A[0][1] == "O" && A[1][1] == "O" && A[2][1] =="O") || (A[0][2] == "O" && A[1][2] == "O" && A[2][2] =="O")){
            Vencedor = 2;
            return Vencedor;
        }

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