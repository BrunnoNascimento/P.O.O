import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data(){};

    Scanner s = new Scanner(System.in);

    public Data(int d, int m, int a){

        this.dia = d;

        this.mes = m;

        this.ano = a;

    }
    public void cadastraDados(int dia, int mes, int ano){
        
        System.out.println("Qual é o dia?");
        dia = s.nextInt();

        System.out.println("Qual o mês?");
        mes = s.nextInt();

        System.out.println("Qual o ano?");
        ano = s.nextInt();
    }
    public void imprimeData(int dia, int mes, int ano){
        
        System.out.println("Data: " + this.dia + "/" + this.mes + "/" + this.ano);
        
    }
}