import javax.swing.JOptionPane;

public class usaVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();

        v1.setVendas(Float.parseFloat(JOptionPane.showInputDialog("Digite as vendas totalitárias = ")));
        v1.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário base = ")));
        v1.setNome(JOptionPane.showInputDialog("Digite o nome do vendedor = "));
        v1.setFalta(Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas totais = ")));

        v1.imrpimirDados();
    }
}
