public class Curso {
    //lista de atributos
    String nome;
    int qtdeAlunos;
    String turma;

    //construtores com parametros
    //passando os parametros
    public Curso(String nome, int qtdeAlunos, String turma){
        //identificar o atributo da classe, chamar
        this.nome = nome;
        this.qtdeAlunos = qtdeAlunos;
        this.turma = turma;
    }
    public Curso(String nome, String turma){
        this.nome = nome;
        this.turma = turma;
    }
}
