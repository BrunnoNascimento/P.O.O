
import javax.swing.JOptionPane;

public class Usuario {
    private String nomeUsuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Usuario(String nomeUsuario, String senha, String nomecompleto, int idade) {
        super(nomecompleto, idade);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
}
