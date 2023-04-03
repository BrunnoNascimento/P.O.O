public class Pessoa {
    protected String nome;
    
    public Pessoa(){}
    
    public Pessoa(String n){
        nome = n;
    }
    
    public Pessoa(String n, String f) {
    }

    public Pessoa(String nomecompleto, int idade) {
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String toString(){
        return nome;
    }
   
}
