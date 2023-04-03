import javax.swing.JOptionPane;

public class Fracao {
    private double numerador;
    private double denominador;

    public Fracao(double n, double d){
        this.numerador = n;
        this.denominador = d;
    }
    public void setNumerador(double numerador){
        this.numerador = numerador;
    }
    public void setDenominador(double denominador){
        this.denominador = denominador;
    }
    public double getNumerador() {
        numerador = Double.parseDouble(JOptionPane.showInputDialog("Digite o numerador: "));
        return numerador;
    }
    public double getDenominador() {
        denominador = Double.parseDouble(JOptionPane.showInputDialog("Digite o denominador: "));
        return denominador;
    }
    

    public Fracao achaMaior(Fracao f){
        double f1, f2;
        f1 = this.numerador / this.denominador;
        f2 = f.numerador / f.denominador;
        if (f1 > f2){
            return this;
        } else{
            return f;
        }
    }
    public void multiplicaCom(Fracao f){
        this.numerador = this.numerador *f.numerador;
        this.denominador = this.denominador * f.denominador;
    }
    public boolean saoEquivalentes(Fracao f){
        double f1, f2;
        f1 = this.numerador / this.denominador;
        f2 = f.numerador / f.denominador;
        if (f1 == f2){
            return true;
        } else{
            return false;
        }
    }
    public boolean saoEquivalentes(double valor){
        double f1;
        f1 = this.numerador / this.denominador;
        if (valor == f1){
            return true;
        } else{
            return false;
        }
    }

    public void imprimeDados(){
    
    }

}