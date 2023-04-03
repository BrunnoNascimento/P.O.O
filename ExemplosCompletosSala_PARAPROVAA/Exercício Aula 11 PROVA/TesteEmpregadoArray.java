import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteEmpregadoArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //ArrayList
        //dinâmico - qtde de elementos flexivel
        //heterogeneo = armazena tipos diferentes

        //criando um ArrayList - declarar e instanciar
        ArrayList firma2 = new ArrayList<Empregado>();

        int tipo;

        String resp;

        do{
            tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite 1 para Analista ou 2 para Programador ou 3 imprimir"));
            switch(tipo){
                case 1: 
                    Analista aux = new Analista();
                    aux.cadastraDados();
                    //armazena objeto no ArrayList
                    firma2.add(aux);
                    break;
                case 2:
                    Programador auxp = new Programador();
                    auxp.cadastraDados();
                    firma2.add(auxp);
                    break;
                case 3:
                    for(int i=0; i<firma2.size(); i++){
                        if (firma2.get(i) instanceof Analista)
                            ((Analista)firma2.get(i)).imprimir();
                        else
                            ((Programador)firma2.get(i)).imprimir();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            //atualiza variável de controle
            resp =  JOptionPane.showInputDialog("Deseja cadastrar novo empregado?");
        }while(resp.equalsIgnoreCase("s"));

    }
}
