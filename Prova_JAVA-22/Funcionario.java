public abstract class Funcionario{
    private String nome;
    private String nrocarteira;

    //construtor
    public Funcionario(String nome, String nrocarteira){
        this.nome = nome;
        this.nrocarteira = nrocarteira;
    }

    //métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNrocarteira() {
        return nrocarteira;
    }

    public void setNrocarteira(String nrocarteira) {
        this.nrocarteira = nrocarteira;
    }

    //abstrato print
    public abstract String print();

    public void obterDados(){
        System.out.println("Nome: " + nome + 
        "\nNúmero da carteira de trabalho: " + nrocarteira);    
    }
    
}
