import javax.swing.JOptionPane;

public class Paciente {
    String paciente;
    String rg;
    int anoNascimento;
    String profissao;

    public Paciente(){}

    public Paciente(String n){
        paciente = n;
    }

    public void cadastraDados(){
        paciente = JOptionPane.showInputDialog("Entre com o nome: ");

        rg = JOptionPane.showInputDialog("Digite o rg: ");

        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de nascimento do paciente: "));

        profissao = JOptionPane.showInputDialog("Entre com sua profissão: ");
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome do paciente:" + paciente + "\nRG:" + rg
        + "\nAno de Nascimento:" + anoNascimento + "\nProfissão:" + profissao);
    }

    public int calculaIdade(int anoAtual){
        if(anoAtual >= anoNascimento){
            anoAtual = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Idade: " + anoAtual);
            return anoAtual;
        }
        else{
            JOptionPane.showMessageDialog(null, "Idade: -1");
            return -1;
        }
    }
}
