public class Fornecedor extends Pessoa implements Seguranca{
    private float valorCompra;

    public Fornecedor() {
    }
    public Fornecedor(String n, String f, float vc){
        super(n, f);
        valorCompra = vc;
    }
    public float getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    public void print (){
        super.print();
        System.out.println("Valor da compra = "+ valorCompra);
    }
    @Override
    public boolean validar() {
        if (valorCompra > 0){
            return true;
        }
        return false;
    }
 
}
