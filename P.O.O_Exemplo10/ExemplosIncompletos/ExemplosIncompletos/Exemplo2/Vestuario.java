public class Vestuario extends Produto{
    private String nome;
    private String cor;
    private String tamanho;

    public Vestuario() {    }
    
    

    public Vestuario(int codigo, float valor, String nome, String cor, String tamanho) {
        super(codigo, valor);
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }



    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String print(){
        String saida = "";
        saida = saida + super.print(); // ou utilizar o += para concatenar mais facilmente o atributo ao print();
        saida += "\nNome: " + nome;
        saida += "\nCor: " + cor;
        saida += "\nTamanho: " + tamanho;
        return saida;
    }
}
