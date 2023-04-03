
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {   

        //declaração do vetor do tipo Aluno
        Aluno sala[];
        //instanciação
        sala = new Aluno[3];

        //declaração e instanciação do ArrayList
        //estrutura de dados dinâmica
        ArrayList turma = new ArrayList<Aluno>();
        String resp;
        
        do{
            Aluno aux = new Aluno();
            aux.leitura();
            //add = adiciona o objeto no final do ArrayList
            turma.add(aux);
            resp = JOptionPane.showInputDialog(
                "Deseja criar novo aluno");

        }while(resp.equalsIgnoreCase("s"));

        for (int i = 0; i<turma.size(); i++){
            Aluno aux = (Aluno)turma.get(i);
            aux.print();
        }

        //for(int i = 0; i < sala.length; i++){
            //instancia um objeto em cada posição do vetor
          //  sala[i] = new Aluno();
            //chama o método leitura para cada objeto do vetor
           // sala[i].leitura();
       // }

//        for (int i = 0; i < sala.length; i++){
//            sala[i].print();
//        }

    }

}
