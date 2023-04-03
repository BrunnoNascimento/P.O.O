
import javax.swing.JOptionPane;

public class Usuario extends Pessoa implements Imprimivel, Seguranca {
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

    @Override
    public boolean validar() {
        //equals - método que compara String
        //texto1.equals("texto2")
        //equalsIgnoreCase() - compara String, ignora case sensitive
        if(senha.equals("") || nomeUsuario.equals("")){
            return false;            
        }
        else{
            return true;
        }    
    }

    @Override
    public String formatoString() {
        //nlin = constante definida na interface Imprimivel
        String texto = "Usuário = " + nomeUsuario + nlin + 
        "Senha = " + senha;
        return texto;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println(this.formatoString());
        
    }

   
}
