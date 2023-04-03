import javax.swing.JOptionPane;

public class Vendedor{
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float v, float s, String n, int f){
        this.vendas = v;
        this.salario = s;
        this.nome = n;
        this.falta = f;
    }

    public Vendedor(){

    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public float calcularComissão(){
        if(vendas >= 1000 && vendas < 2000){
            return vendas + vendas * (1/10);
        }
        else{
            if(vendas >= 2000){
                return vendas + vendas * (15/100);
            }
            else{
                return vendas;
            }
        }
    }

    public float descontoFalta(){
        return (salario/30)*falta;
    }

    public float calcularSalario(){
        return (salario + calcularComissão() - descontoFalta());
    }

    public void imrpimirDados(){
        JOptionPane.showMessageDialog(null, "Vendas = " + vendas +"\nSalário = " + salario + "\nNome = " + nome + "\nFaltas = " + falta + "\nComissão = " + calcularComissão() + "\nDesconto faltas = " + descontoFalta() + "\nSalário final = " + calcularSalario());
    }
    
}