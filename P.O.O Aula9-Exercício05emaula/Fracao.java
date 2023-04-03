public class Fracao{
    private double numerador;
    private double denominador;

    public Fracao(double n, double d){
        numerador = n;
        denominador = d;
    }

    //gets and seters
    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    //métodos
    public Fracao achaMaior(Fracao f){
        double f1, f2;
        f1 = this.numerador/this.denominador;
        f2 = f.numerador / f.denominador;

        if (f1 > f2){
            return this;
        }
        else{
            return f;
        }
    }

    public void multiplicaCom(Fracao f){
        this.numerador = this.numerador*f.numerador;
        this.denominador = this.denominador*f.denominador;
    }

    public boolean saoEquivalentes(Fracao f){
        
    }

    public boolean saoEquivalentes(double valor){

    }
}