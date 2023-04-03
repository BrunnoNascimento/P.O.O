import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsaProgramador{
    public static void main(String[] args) {
        ArrayList empresa = new ArrayList<Funcionario>();

        int tipo;
        String resposta;
        
        do{
            tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite 1 para Diarista ou 2 para Mensalista ou 3 Exibir"));
            switch(tipo){
                case 1: 
                    Diarista auxd = new Diarista(0,0, null, null);
                    auxd.obterDados();
                    //armazena objeto no ArrayList
                    empresa.add(auxd);
                    break;
                case 2:
                    Mensalista auxm = new Mensalista(null, null, 0 ,0);
                    auxm.obterDados();
                    empresa.add(auxm);
                    break;
                case 3:
                    for(int i=0; i<empresa.size(); i++){
                        if (empresa.get(i) instanceof Diarista)
                            ((Diarista)empresa.get(i)).print();
                        else
                            ((Mensalista)empresa.get(i)).print();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            //atualiza variável de controle
            resposta =  JOptionPane.showInputDialog("Deseja incluir mais um Diarista ou Mensalista?");
        }while(resposta.equalsIgnoreCase("s"));

    }

}