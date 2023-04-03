public class UsaContaPoupanca {
    public static void main(String[] args) {
        //declaração dos objetos 
        ContaPoupança p1, p2, p3;

        //declaração de variavel auxiliar
        double resultado;

        //instanciação do objeto 
        p1 = new ContaPoupança();
        p1.imprimeDados();

        p2 = new ContaPoupança("001" , "123" , 1000.5, 10);
        p2.imprimeDados();

        //usando os métodos
        p1.deposita(500);
        p1.imprimeDados();

        resultado = p2.calculaRendimento();
        System.out.println("Redimento: " + resultado);

    }
}
