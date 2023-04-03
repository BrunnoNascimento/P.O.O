import javax.swing.JOptionPane;

public class usaPaciente {
    public static void main(String[] args) {

        Paciente p1;
        int anoAtual;

        p1 = new Paciente();

        p1.cadastraDados();
        p1.imprimeDados();

        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano atual: "));
        
        p1.calculaIdade(anoAtual);
    }
}