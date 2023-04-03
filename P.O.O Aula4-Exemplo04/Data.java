public class Data {
    //lista de atributos
    int dia;
    int mes;
    int ano;

    //construtores
    //padrão
    public Data(){
    }

    //definindo o construtor com parâmetros (informações passadas no momento da contrução)
    public Data(int d, int m, int a){
        //atribuição dos parametros aos atributos
        dia = d;
        mes = m;
        ano = a;
    }
}
