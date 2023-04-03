import javax.swing.JOptionPane;

public class Analista extends Empregado implements Calcula {
    
    private float valorPorProjeto;
    private int qtdeProjeto;

    public Analista() {
    }

    public Analista(String nome, String matricula, float valorPorProjeto, int qtdeProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
        this.qtdeProjeto = qtdeProjeto;
    }

    public float getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }

    public int getQtdeProjeto() {
        return qtdeProjeto;
    }

    public void setQtdeProjeto(int qtdeProjeto) {
        this.qtdeProjeto = qtdeProjeto;
    }

    public void cadastraDados(){
        nome = JOptionPane.showInputDialog("Digite o nome");
        matricula = JOptionPane.showInputDialog("Digite a matricula");
        valorPorProjeto = Float.parseFloat(
            JOptionPane.showInputDialog("Digite o valor por projeto"));
        qtdeProjeto = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a quantidade de projetos"));    
    }

    @Override
    public float calculaSalario() {
        return valorPorProjeto*qtdeProjeto;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome + 
        "\nMatricula: " + matricula + 
        "\nValor por projeto: " + valorPorProjeto + 
        "\nQtde de projetos: " + qtdeProjeto +
        "\nSalário: " + calculaSalario());      
        
    }
    
    
    
    
}
