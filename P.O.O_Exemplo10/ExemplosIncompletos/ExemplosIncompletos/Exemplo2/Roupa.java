public class Roupa extends Vestuario{
    //atributos
    private String tecido;

    //construtores
    public Roupa() {    }
    
    

    public Roupa(int codigo, float valor, String nome, String cor, String string, String tecido) {
        super(codigo, valor, nome, cor, string);
        this.tecido = tecido;
    }



    //get's e set's
    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    
    public String print(){
        String saida = "Dados do roupa:"; 
        saida += super.print();
        saida += "\nTecido: " + tecido;
        return saida;
    }
}
