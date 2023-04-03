import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class TesteChamado {
    public static void main(String[] args) {
        //variáveis auxiliares
        String nome, problema;
        double ca, cp;

        //entrada de dados
        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        problema = JOptionPane.showInputDialog("Digite o problema do cliente: ");
        ca = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo: "));
        cp =  Double.parseDouble(JOptionPane.showInputDialog("Digite o custo das peças"));

        //primeiro objeto
        Chamado ch1 = new Chamado("Brunno", "Peça quebrada");

        //segundo objeto
        Chamado ch2 = new Chamado(nome, problema, ca, cp);

        //solicita dados dos custos
        ca = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo: "));
        cp =  Double.parseDouble(JOptionPane.showInputDialog("Digite o custo das peças"));

        //alterando os atributos
        ch1.setCustoatendimento(ca);
        ch1.setCustopecas(cp);

        //item c
        cp = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo das peças: "));
        ch2.acrescentaPeca(cp);

        int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de peças: "));
        cp = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo das peças: "));
        ch1.acrescentaPeca(qtde, cp);

        //item d
        Chamado ch3;
        ch3 = ch1.maiorCusto(ch2);

        //item e
        String cliente = ch1.menorValorPeca(ch3);

        JOptionPane.showMessageDialog(null, "Cliente com menor valor peça: " + cliente);

        //item f
        JOptionPane.showMessageDialog(null, "Chamado 1: " + ch1.exibir() + "\nChamado 2: " + ch2.exibir() + "\nChamado 3: " + ch3.exibir());


    }
}
