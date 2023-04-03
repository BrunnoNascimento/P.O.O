import javax.swing.JOptionPane;

public class TestePublicacao {
    public static void main(String[] args) {
        Publicacao p1;
        Revista p2;        
        String e, t;
        
        t = JOptionPane.showInputDialog("Digite o título do livro");
        e = JOptionPane.showInputDialog("Digite o nome da editora");
        p1 = new Livro(t,e);
        p1.imprimir();
        
        //instanciação
        p2 = new Revista();
        p2.leitura();
        p2.imprimir();
    }
}
