import javax.swing.JOptionPane;

public class ContaCorrente {
    //atributos 
    String nome;
    double saldo;
    double limite;
    char tipo;

    //construtores e difinição do construtor
    //mesmo nome da classe
    public ContaCorrente(String n, double s, double l, char t){
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }
    
    public ContaCorrente(String n, double s, char t){
        nome = n;
        saldo = s;
        tipo = t;
    }
    
    //metodos 
    //void = a retorno vazio, nenhuma informação para quem chamar esse metodo, vai la e executa a tarefa mas não volta a informação
    //metodo sempre em minusculo e se for composto o segundo nome é em maiusculo 
    //metodo sem parâmetros  
    public void mostraDados(){
        //exibir os valores dos atributos 
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
        "\nSaldo: " + this.saldo +
        "\nLimite: " + this.limite +
        "\nTipo: " + this.tipo);


    }
    //metodo com retorno vazio e passagem de parâmetro 
    public void depositar(double valor){
        //atualiza o saldo da conta, somando o valor informado
        this.saldo = this.saldo + valor;
        //this.saldo += valor;
    }

    //metodo com retorno vazio e passagem de parâmetro
    public void saque(double valor){
        //atualiza o saldo da conta e vai subtrair o valor do saldo
        saldo = saldo - valor; 
        //saldo += valor,
    }


}