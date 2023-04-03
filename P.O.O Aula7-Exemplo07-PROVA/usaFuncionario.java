import javax.swing.JOptionPane;

public class usaFuncionario {
    public static void main(String[] args) {
        Funcionario f1, f2;

        String cargo;
        int cracha;
        float sal;

        cargo = JOptionPane.showInputDialog("Digite o cargo");
        cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o cracha"));
        sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário"));

        //instanciação dos objetos
        f1 = new Funcionario(cracha, sal, cargo);
        //construtor padrão do: Funcionario
        f2 = new Funcionario();

        JOptionPane.showMessageDialog(null, f1.retornaDados());
        JOptionPane.showMessageDialog(null, f2.retornaDados());

        f1.calculaAumento(10);
        JOptionPane.showMessageDialog(null, f1.getSalario());
        f2.setCracha(345);
        sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário"));
        f2.setSalario(sal);

        JOptionPane.showMessageDialog(null, "Funcionario 2: " + f2.getSalario());
    }
}
