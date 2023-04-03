public class Mensalista extends Funcionario implements Calcula {

    protected float salario;
    private int diasFaltosos;

    public Mensalista(String nome, String nrocarteira, float salario, int diasFaltosos) {
        super(nome, nrocarteira);
        this.salario = salario;
        this.diasFaltosos = diasFaltosos;
    }

    @Override
    public String print() {
        System.out.println("Nome: " + getNome() + 
        "\nNúmero da carteira: " + getNrocarteira() + 
        "\nSalário: " + salario + 
        "\nDias faltosos: " + diasFaltosos+ calculaSalario() + calculaInss());
        return null;  
        
    }

    @Override
    public float calculaSalario() {
        return salario = salario - (salario/30)*diasFaltosos;
    }

    public float calculaInss(){
        return salario*9/100;
    }

    public void obterDados(){
        System.out.println("Nome: " + getNome() + 
        "\nNúmero da carteira: " + getNrocarteira() + 
        "\nSalário: " + salario + 
        "\nDias faltosos: " + diasFaltosos+ calculaSalario() + calculaInss());  
        return;

    }
    
}
