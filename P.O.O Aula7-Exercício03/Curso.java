import javax.swing.JOptionPane;

public class Curso {
    String nome;
    int qtdeAlunos;
    String turma;
    float mensalidade;

    public Curso(){}

    public Curso(String n, int q, String t, float m){
        nome = n;
        qtdeAlunos = q;
        turma = t;
        mensalidade = m;
    }
    
    public void cadastraCurso(){
        nome = JOptionPane.showInputDialog("Entre com o nome do curso: ");
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de alunos: "));
        turma = JOptionPane.showInputDialog("Entre com a turma desejada: ");
        mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Entre com a mensalidade do curso: "));
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nQuantidade de alunos: " + qtdeAlunos + "\nTurma: " + turma + "\nMensalidade: " + mensalidade);
    }

    public float calculaTotalMensalidade(){
        if(qtdeAlunos >= 0){
            mensalidade = qtdeAlunos*mensalidade;
            JOptionPane.showMessageDialog(null, "Mensalidade total: " + mensalidade);
            return mensalidade;
        }
        else{
            JOptionPane.showMessageDialog(null, "Mensalidade total: 0");
            return 0;
        }
    }
}