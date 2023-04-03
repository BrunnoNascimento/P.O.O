public class Funcionario{
    //atributos
    private int cracha;
    private float salario;
    private String cargo;

    //contrutores
    public Funcionario(){
        cargo = "Assistente";
    }
    public Funcionario(int c, float s, String car){
        cracha = c;
        salario = s;
        cargo = car;
    }
    //métodos de acesso
    //leituras e escritas - get's and set's
    public int getCracha() {
        return cracha;
    }
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //sobrecarga de métodos
    public void calculaAumento(float p){
        salario = salario + salario*p/100;
    }
    public void calculaAumento(int tempo){
        salario = salario + (tempo * 150);
    }
    public String retornaDados(){
        String texto;
        texto = "Crachá: " + cracha + "\nCargo: " + cargo + "\nSalário: " + salario;
        return texto;
    }
}
    