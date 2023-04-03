import javax.swing.JOptionPane;

public class UsaData1 {
    public static void main(String[] args) {
        //variaveis
        int auxd, auxm, auxa;
        //construtores padrão
        Data ontem = new Data();
        //construtores com parâmetros com valores definidos
        Data hoje = new Data(6, 9, 2022);
        
        JOptionPane.showMessageDialog(null,
         ontem.dia + "/" +
         ontem.mes + "/" +
         ontem.ano);

         //Mesmo código, por extenso
         //JOptionPane.showMessageDialog(null, ontem.dia + "/" + ontem.mes + "/" + ontem.ano);
        
         JOptionPane.showMessageDialog(null,
         hoje.dia + "/" +
         hoje.mes + "/" +
         hoje.ano);

         //Mesmo código, por extenso
         //JOptionPane.showMessageDialog(null, hoje.dia + "/" + hoje.mes + "/" + hoje.ano);

         auxd = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
         auxm = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes"));
         auxa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));

         //usando as variaveis para instanciar os objetos
         Data amanha = new Data(auxd, auxm, auxa);

         JOptionPane.showMessageDialog(null,
         amanha.dia + "/" +
         amanha.mes + "/" +
         amanha.ano);
    }
}
