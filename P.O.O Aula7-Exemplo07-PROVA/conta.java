public class conta {
    //atributos
    String numero;
    double saldo;

    //construtor
    public conta(String n, double v){
        numero = n;
        saldo = v;
    }

    //métodos
    public void imprimeDados(){
        System.out.println("Número: " + numero + "\nSaldo: " + saldo);
    }

    public void sacarValor(double valor){
        if(this.saldo >= valor){ //bloco verdadeiro
            //atualizo o saldo
            this.saldo = this.saldo - valor;
        }
        else{ //bloco falso
            System.out.println("Saldo insuficiente");
        }
    }

    public double maiorSaldo(conta c){
        if(this.saldo > c.saldo){
            return this.saldo; //o objeto que chama o método que possui o maior saldo
        }
        else{
            return c.saldo;
        }
    }
}

