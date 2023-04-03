public class Livro extends Publicacao{    
    //atributo
    private String editora;
    
    //construtor com herança
    public Livro(String t, String e){
        super(t, "");        
        editora = e;
    }
    
    //métodos de acesso
    public String getEditora() { return editora;  }    
    public void setEditora(String editora) {  this.editora = editora;  }
    
    //implementação, implementa o método abstrato
    public void imprimir(){
        System.out.println("Título: " + this.getTitulo() + "\nData de publicação: " + this.getDataPublicacao() + "\nEditora: " + editora);
    }
}
