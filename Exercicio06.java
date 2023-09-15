import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] distCent = new int[15];
        int[] qteVeranistas = new int[15];
        int[] pavimentacao = new int[15];
        int q = 0, n;
        while (q == 0) {
            n = Integer.parseInt(JOptionPane
                    .showInputDialog("Selecione a Operacão: \n1- Adicionar ou editar dados. \n2- Consultar dados."));
            switch (n) {
                case 1:
                    addDados(qteVeranistas, distCent, pavimentacao);
                    break;
                case 2:
                    consultInformacao(qteVeranistas, distCent, pavimentacao);
                    break;
                case 3:
                    q = 1;
                    break;
            }
        }
    }

    public static void addDados(int[] A, int[] B, int[] C) {
        int q = 0, ID, selector;
        ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ID da praia (de 0 à 15): ")) - 1;
        while (q == 0) {
            selector = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Selecione a operação: \n1- Alterar quantidade de veranistas. \n2- Alterar distância. \n3- Alterar estado da pavimentação. \n4- Voltar ao menu principal."));
            switch (selector) {
                case 1:
                    A[ID] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de veranistas: "));
                    break;
                case 2:
                    B[ID] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a distância: "));
                    break;
                case 3:
                    C[ID] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o estado da pavimentação: \n1. Para pavimentado. \n2. Para NÃO pavimentado. "));
                    break;
                case 4:
                    q = 1;
                    break;
            }
        }
    }

    public static void consultInformacao(int[] A, int[] B, int[] C) {
        int n, q = 0;
        while (q == 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Selecione a informação: \n1- Praia mais distante do centro. \n2- Praia mais próxima do centro. \n3- Praia menos frequentada. \n4- Praias que estão a mais de 15km do centro. \n5- Número de veranistas em praias não pavimentadas. \n6- Número de veranistas em praias pavimentadas. \n7- Voltar ao menu principal."));
            switch (n) {
                case 1:
                    JOptionPane.showMessageDialog(null, maiorDist(B));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, menorDist(B));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, praiaMenosFreq(A));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, praiaMaisQuinze(B));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, maisVeranistasNPav(A, C));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, maisVeranistasPav(A, C));
                    break;
                case 7:
                    q = 1;
                    break;
            }
        }
    }

    public static String maiorDist(int B[]) {
        String n;
        int maiorD = -999999999, i, iD = 0;
        for (i = 0; i < 15; i++) {
            if (B[i] > maiorD) {
                maiorD = B[i];
                iD = i;
            }
        }
        n = ("A praia mais distante do centro é a praia " + (iD + 1) + ", com " + maiorD + " metros de distância.");
        return n;
    }

    public static String menorDist(int B[]) {
        String n;
        int menorD = 999999999, i, iD = 0;
        for (i = 0; i < 15; i++) {
            if (B[i] < menorD && B[i] > 0) {
                menorD = B[i];
                iD = i;
            }
        }
        n = ("A praia mais próxima do centro é a praia " + (iD + 1) + ", com " + menorD + " metros de distância.");
        return n;
    }

    public static String praiaMenosFreq(int A[]) {
        String n;
        int menorD = 999999999, i, iD = 0;
        for (i = 0; i < 15; i++) {
            if (A[i] < menorD && A[i] > 0) {
                menorD = A[i];
                iD = i;
            }
        }
        n = ("A praia menos veranistas é a " + (iD + 1) + ", com " + menorD + " veranistas.");
        return n;
    }

    public static String praiaMaisQuinze(int B[]) {
        String mais15 = "", mais15R = "";
        for (int i = 0; i < 15; i++) {
            if (B[i] >= 15) {
                mais15 += Integer.toString(i + 1) + ", ";
            }
        }
        if(mais15 == ""){
            mais15R = "Não há praias com mais de 15km do centro.";
        }
        else{
            
            mais15 = mais15.substring(0, mais15.length() - 2);
            mais15R = "As praias com mais de 15km do centro são as praias " + mais15 + ".";
        }

        return mais15R;
    }
    
    public static String maisVeranistasNPav(int A[], int C[]) {
        String veranistas = "";
        int totVeranistas = 0;
        for (int i = 0; i < 15; i++) {
            if (C[i] == 0) {
                totVeranistas += A[i];
            }
        }
        if(totVeranistas == 0){
            veranistas = "Não há veranistas que frequentam praias com estradas não pavimentadas. ";
        }
        else{
        veranistas = "A quantidade de veranistas que frequentam praias com estradas não pavimentadas é " + Integer.toString(totVeranistas) + ".";
        }
        
        return veranistas;
    }
    
    public static String maisVeranistasPav(int A[], int C[]) {
        String veranistas = "";
        int totVeranistas = 0;
        for (int i = 0; i < 15; i++) {
            if (C[i] == 1) {
                totVeranistas += A[i];
            }
        }
        if(totVeranistas == 0){
            veranistas = "Não há veranistas que frequentam praias com estradas pavimentadas.";
        }
        else{
        veranistas = "A quantidade de veranistas que frequentam praias com estradas pavimentadas é " + Integer.toString(totVeranistas) + ".";
        }

        return veranistas;
    }
}
