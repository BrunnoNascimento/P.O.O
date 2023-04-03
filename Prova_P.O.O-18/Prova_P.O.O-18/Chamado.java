import javax.swing.JOptionPane;

public class Chamado{
    private String nomecliente;
    private String problema;
    private double custoatendimento;
    private double custopecas;

    //construtores
    Chamado(String nomecliente, String problema){
        this.nomecliente = nomecliente;
        this.problema = problema;
    }

    Chamado(String nomecliente, String problema, double custoatendimento, double custopecas){
        this.nomecliente = nomecliente;
        this.problema = problema;
        this.custoatendimento = custoatendimento;
        this.custopecas = custopecas;
    }

    //get's and set's....
    public String getNomecliente() {
        JOptionPane.showInputDialog("Digite aqui o seu nome:");
        return nomecliente;
    }
    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
    public String getProblema() {
        JOptionPane.showInputDialog("Digite aqui o seu problema:");
        return problema;
    }
    public void setProblema(String problema) {
        this.problema = problema;
    }
    public double getCustoatendimento() {
        JOptionPane.showInputDialog("Digite aqui o custo do atendimento:");
        return custoatendimento;
    }
    public void setCustoatendimento(double custoatendimento) {
        this.custoatendimento = custoatendimento;
    }
    public double getCustopecas() {
        JOptionPane.showInputDialog("Digite aqui o custo das peças:");
        return custopecas;
    }
    public void setCustopecas(double custopecas) {
        this.custopecas = custopecas;
    }

    //métodos.....
    public void acrescentaPeca(double valor){

        custopecas = custopecas + valor;

    }

    public void acrescentaPeca(int qtde, double valor){
        
        custopecas = custopecas + (qtde * valor);

    }

    public double calculaTotal(){

        return custoatendimento + custopecas;

    }

    public String menorValorPeca(Chamado ch){

        if (this.custopecas < ch.custopecas) {
            return this.nomecliente;
        }
        else{
            return ch.nomecliente;
        }

    }
    
    public Chamado maiorCusto(Chamado ch){
        double obj1, obj2;

        obj1 = this.calculaTotal();
        obj2 = ch.calculaTotal();

        if(obj1 > obj2){
            return this;
        }
        else{
            return ch;
        }


    }

    public String exibir(){
        
        String texto;
        texto = "Nome cliente: " + nomecliente + "\nProblema: " + problema + "\nCusto Atendimento: " + custoatendimento + "\nCusto Peças: " + custopecas + "\nTotal: " + this.calculaTotal();
        return texto;

    }
}