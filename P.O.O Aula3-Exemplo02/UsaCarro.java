import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class UsaCarro {
    public static void main(String[] args) {
        //declaração e a instanciação
        Carro fusca = new Carro();
        Carro gol = new Carro();

        //entrada de dados - leia
        //solicita ao usuário os valores dos atributos

        //modo gráfico
        fusca.marca = JOptionPane.showInputDialog("Digite a marca do carro");
        fusca.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        fusca.cor = JOptionPane.showInputDialog("Digite a cor do carro");
        fusca.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
        
        //saída de dados - escreva ou imprima
        //modo gráfico
        JOptionPane.showMessageDialog(null, "Marca = " + fusca.marca + "\nModelo = " + fusca.modelo + "\nAno = " + fusca.ano + "\nCor = " + fusca.cor);

        //entrada de dados
        //modo texto
        Scanner leia = new Scanner(System.in);
        System.out.println( "Digite a marca do carro");
        gol.marca = leia.next();
        System.out.println( "Digite o modelo do carro");
        gol.modelo = leia.next();
        System.out.println( "Digite o ano do carro");
        gol.ano = leia.nextInt();
        System.out.println( "Digite a cor do carro");
        gol.cor = leia.next();

        //saída de dados
        System.out.println("Marca = " + gol.marca + "\nModelo = " + gol.modelo + "\nCor = " + gol.cor + "\nAno = " + fusca.ano);
        
    }
}
