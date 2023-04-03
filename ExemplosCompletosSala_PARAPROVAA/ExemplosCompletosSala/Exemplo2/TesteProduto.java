public class TesteProduto {
    public static void main(String args[])   {
        Produto prod = new Produto("Macarrão",10);
        Usuario usu = new Usuario("Teste", "123");
        
        if(prod.validar()){
            //prod.formatoSystemOut();
            System.out.println("\n" + prod.formatoString());            
        }
        if(usu.validar()){
            usu.formatoSystemOut();
            System.out.println("Nome Usuário:" + usu.getNomeUsuario());
        }       
    }
}
     