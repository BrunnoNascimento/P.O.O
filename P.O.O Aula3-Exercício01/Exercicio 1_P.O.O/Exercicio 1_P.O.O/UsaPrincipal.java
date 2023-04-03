import javax.swing.JOptionPane;

public class UsaPrincipal {
    public static void main(String[] args){

        Celular c1 = new Celular();

        c1.valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do celular:"));
        c1.marca = JOptionPane.showInputDialog("Digite a marca do celular:");
        c1.modelo = JOptionPane.showInputDialog("Digite o modelo do celular:");

        JOptionPane.showMessageDialog(null, "Valor = " + c1.valor + "\nMarca = " + c1.marca + "\nModelo = " + c1.modelo);

        Cliente cli1 = new Cliente();

        cli1.nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        cli1.cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        cli1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente:"));

        JOptionPane.showMessageDialog(null, "Nome = " + cli1.nome + "\nCPF = " + cli1.cpf + "\nIdade = " + cli1.idade);

        Medicamento m1 = new Medicamento();

        m1.nome = JOptionPane.showInputDialog("Digite o nome do medicamento:");
        m1.marca = JOptionPane.showInputDialog("Digite a marca do medicamento:");
        m1.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade necessária do medicamento:"));

        JOptionPane.showMessageDialog(null, "Nome = " + m1.nome + "\nMarca = " + m1.marca + "\nQuantidade = " + m1.quantidade);
    }
}
