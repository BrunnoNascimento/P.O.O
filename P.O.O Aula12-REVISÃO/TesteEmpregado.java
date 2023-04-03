import javax.swing.JOptionPane;

public class TesteEmpregado {
    public static void main(String[] args) {
        //vetor
        //estático - tamanho fixo
        //homogeneo - armazena informações do mesmo tipo

        //criando um vetor - declarar e instanciar
        Empregado firma1[] = new Empregado[4];
        int tipo;

        //preenchendo o vetor
        for (int i=0; i < 4; i++){
            tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite 1 para Analista ou 2 para Programador"));
            if (tipo == 1){
                //instacia objeto na posição do vetor
                firma1[i] = new Analista();
                ((Analista)firma1[i]).cadastraDados();
            }
            else if (tipo == 2){
                firma1[i] = new Programador();
                ((Programador)firma1[i]).cadastraDados();
            }
            else{
                JOptionPane.showMessageDialog(null, "Opção inválida");
                i--;
            }               
        }
        //mostra os valores
        for(int i = 0; i < 4; i++){
            firma1[i].imprimir();
        }
        



    }
}
