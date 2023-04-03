import javax.swing.JOptionPane;

public class UsaContaCorrente {
    public static void main(String[] args) {
        //variaveis
        String auxn;
        double auxs, auxl;
        char auxt;

        //construtores com parâmetros com valores definidos
        ContaCorrente bradesco = new ContaCorrente(auxn, auxs, auxl, auxt);
        
        JOptionPane.showMessageDialog(null,
         bradesco.nome + "/" +
         bradesco.saldo + "/" +
         bradesco.limite + "/" +
         bradesco.tipo);

         
         auxn = JOptionPane.showInputDialog("Digite o nome da conta");
         auxs = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));
         auxl = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite"));
         auxt = JOptionPane.showInputDialog("Digite o tempo");

         //usando as variaveis para instanciar os objetos
         ContaCorrente bradesco = new ContaCorrente(auxn, auxs, auxt, auxl);

         JOptionPane.showMessageDialog(null,
         bradesco.nome + "/" +
         bradesco.saldo + "/" +
         bradesco.tipo + "/" +
         bradesco.limite);
    }
}
