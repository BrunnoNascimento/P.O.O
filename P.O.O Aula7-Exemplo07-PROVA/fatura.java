import javax.swing.JOptionPane;

public class fatura{
    //atributos
    float valor;
    float pontuacao;

    //construtor
    //padrão
    public fatura(){}

    //com parâmetros
    public fatura(float v, int i){
        valor = v;
        pontuacao = i;
    }

    //métodos
    //sobrecarga
    public fatura somaCom(int pont){
        fatura aux = new fatura();
        aux.pontuacao = this.pontuacao + pont;
        aux.valor = this.valor;
        return aux;
    }

    public fatura somaCom(int pont, float v){
        fatura aux = new fatura();
        aux.pontuacao = this.pontuacao + pont;
        aux.valor = this.valor + v;
        return aux;
    }

    public fatura somaCom(fatura f){
        fatura aux = new fatura();
        aux.pontuacao = this.pontuacao + f.pontuacao;
        aux.valor = this.valor + f.valor;
        return aux;
    }

    public void print(){
        JOptionPane.showMessageDialog(null, "Valor: " + valor + "\nPontuação: " + pontuacao);
    }
}