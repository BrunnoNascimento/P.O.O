import javax.swing.JOptionPane;

public class usaTorneio {
    public static void main(String[] args) {
        Torneio t1 = new Torneio();
        
        t1.setNome(JOptionPane.showInputDialog("Digite o nome do participante do torenio: "));
        t1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do participante do torneio: ")));

        t1.imrpimeDados();
    }
}
