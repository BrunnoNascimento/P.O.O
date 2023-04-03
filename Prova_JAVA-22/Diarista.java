public class Diarista extends Funcionario implements Calcula {

    private float valordia;
    private int qtdedias;

    public Diarista(float valordia,int qtdedias,String nome, String nrocarteira) {
        super(nome, nrocarteira);
        this.valordia = valordia;
        this.qtdedias = qtdedias;
        //TODO Auto-generated constructor stub
    }




    public float getValordia() {
        return valordia;
    }



    public void setValordia(float valordia) {
        this.valordia = valordia;
    }



    public int getQtdedias() {
        return qtdedias;
    }



    public void setQtdedias(int qtdedias) {
        this.qtdedias = qtdedias;
    }

    @Override
    public String print() {
        System.out.println("Nome: " + getNome() + 
        "\nNúmero da carteira: " + getNrocarteira() + 
        "\nValor dia: " + valordia + 
        "\nQuantidade de dias: " + qtdedias+ calculaSalario() + calculaInss());
        return null;  
    }

    @Override
    public float calculaSalario() {   
        return qtdedias*valordia;
    }

    public float calculaInss(){
        double soma = 7.5/100;
        return (float) (calculaSalario()+soma);

    }

    public void obterDados(){
        System.out.println("Nome: " + getNome() + 
        "\nNúmero da carteira: " + getNrocarteira() + 
        "\nValor dia: " + valordia + 
        "\nQuantidade de dias: " + qtdedias+ calculaSalario() + calculaInss());  
    }

    

    
    
}
