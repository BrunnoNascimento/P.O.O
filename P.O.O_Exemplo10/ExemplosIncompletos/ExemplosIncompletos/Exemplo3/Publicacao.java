public abstract class Publicacao {
    //atributos
    private String titulo;
    private String dataPublicacao;
    
    //construtores
    public Publicacao(String t, String d){
        titulo = t;
        dataPublicacao = d;
    }

    //métodos de acesso
    public String getTitulo() {  return titulo; }
    public String getDataPublicacao() { return dataPublicacao;  }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDataPublicacao(String dataPublicacao) { this.dataPublicacao = dataPublicacao;  }
    
    //método abstrato, somente dentro da classe abstrata e não possui lógica ou corpo ou abertura e fechamento de chaves
    public abstract void imprimir();
}
