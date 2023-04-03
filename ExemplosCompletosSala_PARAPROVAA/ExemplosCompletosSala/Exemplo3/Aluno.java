public class Aluno extends Pessoa{
    private String rgm;
    
    public Aluno(){}
    
    public Aluno(String n,String r){
        super(n);
        rgm = r;
    }
    
    public String getRgm(){
        return rgm;
    }
    
    public String toString(){
        return rgm + " : " + getNome();
    }
}
