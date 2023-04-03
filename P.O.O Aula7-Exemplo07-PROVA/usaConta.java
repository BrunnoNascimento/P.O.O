import java.util.Scanner;

public class usaConta {
    public static void main(String[] args) {
        conta c1, c2;
        double valor;

        String numero;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numero = leia.nextLine();
        
        System.out.println("Digite o saldo: ");
        valor = leia.nextDouble();

        //instancia o objeto c1
        c1 = new conta(numero, valor);
        c2 = new conta("123", 100.5);

        //utilizar os métodos
        c1.sacarValor(1500);
        c2.sacarValor(500);
        c2.imprimeDados();

        //método que mostra o saldo de maior valor
        System.out.println("Maior saldo: " + c1.maiorSaldo(c2));
    }
}
