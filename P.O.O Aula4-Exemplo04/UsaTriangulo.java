import javax.swing.JOptionPane;

public class UsaTriangulo {
    public static void main(String[] args) {
        //declaração e instanciação do objeto
        Triangulo t1 = new Triangulo();

        //entrada de dados - modo gráfico
        t1.base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triângulo"));
        t1.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triângulo"));

        //saída de dados
        JOptionPane.showMessageDialog(null, "Base = " + t1.base + "\nAltura = " + t1.altura);
    }
}
