import javax.swing.JOptionPane;

public class usaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        //p1.nome = "Silvio Santos";
        p1.setNome("Silvio Santos");

        //p1.idade = 92;
        p1.setIdade(92);

        //p1.renda = 15000.75;
        p1.setRenda(15000.75);

        p1.imprimeDados();

        
        //JOptionPane.showMessageDialog("Nome: " + p1.nome);
        JOptionPane.showMessageDialog(null, "Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade() + "\nRenda: " + p1.getRenda());
    }
}
