import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira N:"));
        JOptionPane.showMessageDialog(null, verificador(n));
    }
    public static String verificador(int N){
        String A = "";
        if(N == 1){
            A = "Dayllon precisará preencher 1 favo.";
        }
        else{
            A = "Dayllon precisará preencher " + Integer.toString(3 * (N - 1)) + " favos.";
        }
        return A;
    }
}
