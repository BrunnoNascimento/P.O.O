import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsaData {
    public static void main(String[] args) {
        //declaração e instanciação do objeto
        Data d1 = new Data();

        //entrada de dados - modo texto
        //modo texto
        
        Scanner leia = new Scanner(System.in);
        System.out.println( "Digite o dia");
        d1.dia = leia.nextInt();
        System.out.println( "Digite o mes");
        d1.mes= leia.nextInt();
        System.out.println( "Digite o ano ");
        d1.ano= leia.nextInt();

        //modo gráfico
        //d1.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia "));
        //d1.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes "));
        //d1.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano "));
        
        //saída de dados
        JOptionPane.showMessageDialog(null, "Dia = " + d1.dia + "\nMes = " + d1.mes + "\nAno = " + d1.ano);
    }
}
