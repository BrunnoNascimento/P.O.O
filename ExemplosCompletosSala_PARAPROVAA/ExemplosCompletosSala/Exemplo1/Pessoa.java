public class Pessoa {
    private String nome;
    private String fone;

    public Pessoa() {
    }

    public Pessoa(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }


    public void print() {
        System.out.println("Nome= " + nome + "\nFone= " + fone);
    }
}
