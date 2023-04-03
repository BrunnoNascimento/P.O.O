import javax.swing.JOptionPane;

public class usaBoletim {
    public static void main(String[] args){
        boletim poo, tda;

        poo = new boletim(8.5,9.5);
        tda = new boletim(5.4,3.6);

        poo.calculaMedia();
        tda.calculaMedia();

        poo.imprimeBoletim();
        tda.imprimeBoletim();

        JOptionPane.showMessageDialog(null, "Conceito POO: " + poo.verificaConceito());

        JOptionPane.showMessageDialog(null, "Conceito TDA: " + tda.verificaConceito());
    } 
}
