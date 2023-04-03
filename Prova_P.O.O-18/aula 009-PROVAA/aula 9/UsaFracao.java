
import javax.swing.JOptionPane;

public class UsaFracao {

    public static void main(String[] args) {
        
        Fracao f1 = new Fracao(0, 0);
        Fracao f2 = new Fracao(0, 0);

        f1.getNumerador();
        f1.getDenominador();

        f2.getNumerador();
        f2.getDenominador();

        f1.achaMaior(f2);
        f1.saoEquivalentes(f2);

        f1.imprimeDados();
        f2.imprimeDados();
        f1.multiplicaCom(f2);
        f1.imprimeEquals(f2);
        f1.imprimeDados(f2);
    }
}