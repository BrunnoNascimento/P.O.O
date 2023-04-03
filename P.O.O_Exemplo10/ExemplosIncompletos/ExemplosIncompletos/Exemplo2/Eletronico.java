public class Eletronico extends Produto{
    private String descricao;
    private int voltagem;

    //construtores
    public Eletronico() {  
        super();
    }
    
    public Eletronico(int codigo, float valor, String descricao, int voltagem) {
        super(codigo, valor);
        this.descricao = descricao;
        this.voltagem = voltagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    public String print(){
        String saida="";
        saida += super.print(); // += saída = saída + super.print
        saida += "\nDescrição: " + descricao;
        saida += "\nVoltagem: " + voltagem;
        return saida;
    }
    
}
