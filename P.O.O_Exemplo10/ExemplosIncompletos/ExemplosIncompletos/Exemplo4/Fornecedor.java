public class Fornecedor extends Pessoa{
    //atributos
    private float valorCompra;

    //construtores
    public Fornecedor() {
    }
    public Fornecedor(String n, String f, float vc){
        super(n, f);
        valorCompra = vc;
    }
    //gets and setters
    public float getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    public void print(){
        super.print();
        System.out.println("Valor da compra = " + valorCompra);
    }
}   
