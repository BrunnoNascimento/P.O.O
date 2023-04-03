public class Filho extends Pai{
    private int d;

    public void imprimeDados(){
        System.out.println("a: " + a + "\nb: " + b + "\nc: " + this.getC() + "\nd: " + d);
    }
}
