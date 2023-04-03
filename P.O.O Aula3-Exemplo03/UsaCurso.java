import javax.swing.JOptionPane;

public class UsaCurso {
    public static void main(String[] args) {
        //declaração e instanciação do objeto
        Curso c1 = new Curso();

        //entrada de dados - modo gráfico
        c1.nome = JOptionPane.showInputDialog("Digite o nome do curso");
        c1.qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
        c1.turma = JOptionPane.showInputDialog("Digite a turma");

        //saída de dados
        JOptionPane.showMessageDialog(null, "nome = " + c1.nome + "\nqtdeAlunos = " + c1.qtdeAlunos + "\nTurma = " + c1.turma);
    }
}
