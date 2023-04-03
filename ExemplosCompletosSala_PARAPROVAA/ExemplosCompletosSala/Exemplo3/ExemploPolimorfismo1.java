public class ExemploPolimorfismo1 {

    public static void main(String[] args) {
        //Usando vetor
        //declaração e instanciação do vetor
        Pessoa p[] = new Pessoa[3];
        //declaração dos objetos em cada posição do vetor
        //polimorfismo
        p[0] = new Pessoa("José");
        p[1] = new Aluno("Lukas", "123456");
        p[2] = new Professor("Obama", 12345);

        //length = retorna qtde de elementos do vetor
        for (int i=0; i<p.length; i++){
            //usa o método toString para cada objeto do vetor p
            System.out.println(p[i].toString());
        }

        
    }    
}



