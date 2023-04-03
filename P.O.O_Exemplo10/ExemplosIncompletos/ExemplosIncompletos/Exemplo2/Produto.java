public class Produto {
    private int codigo;
    private float valor;

    public Produto() {    }

    public Produto(int codigo, float valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    //método print que retorna uma String
    public String print(){
        String saida = "\nCódigo: " + codigo;
        saida += "\nValor: R$" + valor;
        return saida;
    }
    
}
