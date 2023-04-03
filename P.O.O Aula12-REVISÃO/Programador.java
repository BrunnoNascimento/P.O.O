import javax.swing.JOptionPane;

public class Programador extends Empregado implements Calcula {
    
    private float qtdeHoras;
    private float valorHora;

    public Programador() {        
    }

    public Programador(String nome, String matricula, float qtdeHoras, float valorHora) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public void cadastraDados(){
        nome = JOptionPane.showInputDialog("Digite o nome");
        matricula = JOptionPane.showInputDialog("Digite a matricula");
        valorHora = Float.parseFloat(
            JOptionPane.showInputDialog("Digite o valor por hora"));
        qtdeHoras = Float.parseFloat(
                JOptionPane.showInputDialog("Digite a quantidade de horas"));    
    }
    @Override
    public float calculaSalario() {
        return qtdeHoras * valorHora;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + nome + 
        "\nMatricula: " + matricula + 
        "\nValor por hora: " + valorHora + 
        "\nQtde de horas: " + qtdeHoras + 
        "\nSalário: " + calculaSalario());     
        
    }

    

    

    
}
