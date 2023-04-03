public class TestePessoa {
    public static void main(String[] args) {
        Cliente c1;
        Fornecedor f1;

        //instanciação em herança usando construtor com parâmetros 
        c1 = new Cliente("Fulano de Tal", "999775544", 500.5f);
        f1 = new Fornecedor("Coca-Cola", "0800123456", 1500.8f);

        c1.print();
        f1.print();

        //Polimorfismo = possibilidade de um objeto ser de diferentes formas
        Pessoa objeto1, objeto2; //declarados a partir da classe pai
        objeto1 = new Cliente("Beltrano", "159753", 50.8f);
        objeto2 = new Fornecedor("Ciclano", "33330000", 45.4f);

        objeto1.print();
        objeto2.print();
    }
}
