public class ContaCorrente {
        //lista de atributos
        String nome;
        double saldo;
        double limite;
        char tipo;
    
        //construtores com parametros
        //passando os parametros
        public ContaCorrente(String n, double s, double l, char t){
            //identificar o atributo da classe, chamar
            nome = n;
            saldo = s;
            limite = l;
            tipo = t;
        }
        public ContaCorrente(String n, double s, char t){
            nome = n;
            saldo = s;
            tipo = t;
        }
}
