import javax.swing.JOptionPane;

public class UsaCurso1 {
    public static void main(String[] args) {
        //declaração de variáveis
        String n, t;
        int q;

        //declaração de dados
        n = JOptionPane.showInputDialog("Digite o nome do curso");
        t = JOptionPane.showInputDialog("Digite o nome da turma");
        q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));

        //instanciação do objeto
        Curso ads = new Curso(n, q, t);
        JOptionPane.showMessageDialog(null, "Nome: " + ads.nome + "\nAlunos: " + ads.qtdeAlunos + "\nTurma: " + ads.turma);
        
        //instanciação do objeto - construçaõ padrão
        //Curso redes = new Curso();

        n = JOptionPane.showInputDialog("Digite o nome do curso");
        t = JOptionPane.showInputDialog("Digite o nome da turma");

        //instanciação do objeto usando outro construtor
        Curso ccp = new Curso(n,t);
        //saída
        JOptionPane.showMessageDialog(null, "Nome: " + ccp.nome + "\nAlunos: " + ccp.qtdeAlunos + "\nTurma: " + ccp.turma);
    }
}
