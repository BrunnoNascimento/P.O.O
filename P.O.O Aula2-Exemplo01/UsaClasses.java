public class UsaClasses {
    //criar o método principal
    public static void main(String args[]) {
        //declaração do objeto
        //reserva espaço na memória
        Pessoa p1;
        //instanciar o objeto
        //associar os atributos e métodos ao espaço declarado
        p1 = new Pessoa();
        //declaração e instanciação
        Pessoa p2 = new Pessoa();

        //exibe os valores dos atributos
        System.out.println("Nome = " + p1.nome); //comando de saída que exibe uma informação na tela
        System.out.println("Idade = " + p1.idade);
        System.out.println("Renda = " + p1.renda);

        //atribuir valores para os atributos de p2
        p2.nome = "Silvio Santos";
        p2.idade = 93;
        p2.renda = 15900.50;

        //exibe os valores dos atributos
        System.out.println("\nNome = " + p2.nome); //comando de saída que exibe uma informação na tela
        System.out.println("Idade = " + p2.idade);
        System.out.println("Renda = " + p2.renda);
    }
}
