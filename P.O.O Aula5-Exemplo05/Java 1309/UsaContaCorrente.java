import javax.swing.JOptionPane;

public class UsaContaCorrente {
    public static void main(String[] args) {
        //variaveis auxiliares 
        //instannciar o objeto com os valores que o usuario fornecer 
        String nome;
        double saldo, limite, v;
        char tipo;

        //declaração dos objetos
        ContaCorrente conta1, conta2;

        //solicita dados do conta1
        //armazena o que o usuario digita
        nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
        limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta"));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (E = Especial / S = Simples)").charAt(0);

        //instancia objeto conta1
        conta1 = new ContaCorrente(nome, saldo, limite, tipo);

        //solicita dados  do conta2
        //mesmo o limite não ser instanciado ele existe na conta2 vai ser 0.0
        nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (E = Especial / S = Simples)").charAt(0);

        //charAt(indice) = obtem o caracter do indice informado (char)
        //toUpperCase() = converte String para Maiusculo 

         //instancia objeto conta2
        conta2 = new ContaCorrente(nome, saldo, tipo);

        //mostra os dados dos objetos usando metodos
        //objeto.nomeMetodo
        conta1.mostraDados();
        conta2.mostraDados();

        //deposita 500reais na conta1
        conta1.depositar(10.000);

        conta1.mostraDados();

        //solicita valor do deposito para conta2
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        conta2.depositar(v);
        conta2.mostraDados();

        //realiza saque na conta 
        conta1.saque(100.0);
        conta1.mostraDados();

        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
        conta2.saque(v);
        conta2.mostraDados();


    }
}
