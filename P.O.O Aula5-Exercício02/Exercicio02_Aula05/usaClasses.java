import java.util.Scanner;
import javax.swing.JOptionPane;

public class usaClasses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        triangulo tA = new triangulo();

        tA.x = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do seu primeiro triângulo (cm): "));
        tA.y = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do seu primeiro triângulo (cm): "));

        tA.calculoDaArea(tA.x, tA.y);
        tA.imprimeDados();

        triangulo tB = new triangulo();

        tB.x = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do seu segundo triângulo (cm): "));
        tB.y = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do seu segundo triângulo (cm): "));

        tB.calculoDaArea(tB.x, tB.y);
        tB.imprimeDados();

        Data d = new Data();

        d.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
        d.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
        d.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

        d.imprimeData(0, 0, 0);

        s.close();
    }
}