
import javax.swing.JOptionPane;

public class Produto implements Imprimivel, Seguranca {
    private String descricao;
    private int quantidade;

    public Produto(String d, int q) {
        descricao = d;
        quantidade = q;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean validar() {
        if (quantidade > 0){
            return true;
        }
        else{
            System.out.println("Quantidade inválida");
            return false;
        }
    }

    @Override
    public String formatoString() {
        String texto = "Quantidade = " + quantidade + nlin +
        "Descrição = " + descricao;
        return texto;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println(this.formatoString());
        
    }
    

}