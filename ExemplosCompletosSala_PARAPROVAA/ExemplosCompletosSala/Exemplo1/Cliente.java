public class Cliente extends Pessoa{
    private float valorDivida;

    public Cliente() {
    }
    
    public Cliente(String n, String f, float v){
        super(n, f); //super = chama o construtor da classe pai
        valorDivida = v;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    public void print(){
        super.print(); //super = chama o método da classe pai
        System.out.println("Valor Dívida = " + valorDivida); 
    }

    
}
