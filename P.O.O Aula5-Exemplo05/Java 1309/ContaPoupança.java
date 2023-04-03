public class ContaPoupança {
    //atributos
    String agencia;
    String numero;
    double saldo;
    double taxa;

    //contrutores padrão
    public ContaPoupança(){

    }
    //com parâmetros 
    public ContaPoupança(String a, String n, double s, double t){
        agencia = a;
        numero = n;
        saldo = s;
        taxa = t;
    }

    //metedos 
    public void imprimeDados(){
        System.out.println("Agencia: " + agencia +
        "\nNumero: " + numero +
        "\nSaldo: " + saldo +
        "\ntaxa: " + taxa);
    }
    //metdo sem retorno e com parâmetro
    public void deposita (double valor){
        saldo += valor;
    }
    //metodo sem parâmetro e com retorno
    public double calculaRendimento(){
        double rendimento;
        rendimento = saldo*taxa/100;
        return rendimento; 
        //retorno do metodo deve ser do mesmo tipo definido na assinatura 
    }


}
