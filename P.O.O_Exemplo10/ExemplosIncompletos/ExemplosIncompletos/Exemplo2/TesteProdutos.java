public class TesteProdutos {

    public static void main(String[] args) {
        Produto p = new Produto(10, 15.89f);
        System.out.println(p.print());
        
        Eletronico e = new Eletronico(10, 500.5f, "TV", 110);
        System.out.println(e.print());
        
        Vestuario v = new Vestuario(20, 50.6f, "Camisa", "azul", "G");
        System.out.println(v.print());
        
        Calcado c = new Calcado(30, 100.5f, "Nike", "Preto", 37, "Borracha", "Veludo", "Espuma");
        System.out.println(c.print());
        
        Roupa r = new Roupa(40, 150, "Calça", "Verde", "40", "Jeans");
        System.out.println(r.print());
    }
    
}
