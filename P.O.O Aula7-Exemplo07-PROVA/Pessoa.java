import javax.swing.JOptionPane;
//Na classe nós declaramos os atributos e métodos
public class Pessoa {
    //atributos
    //modificadores de acesso e o tipo deste atributo
    private String nome;
    private int idade;
    private double renda;

    //método
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nRenda: " + renda);
    }
    //métodos de acesso
    //escrita - set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
            if(idade>=0 && idade <= 150){
            this.idade = idade;
        }
    }
    public void setRenda(double renda){
        if(renda >= 0 ){
            this.renda = renda;
        }
    }

    //leitura - get
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getRenda(){
        return renda;
    }
}
