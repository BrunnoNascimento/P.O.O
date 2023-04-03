import java.util.Scanner;

public class triangulo{

    float x;
    float y;
    float z;

    public triangulo(){};
    Scanner s = new Scanner(System.in);

    public triangulo(float x, float y, float z){

        this.x = x;

        this.y = y;

        this.z = z;

    }

    public float calculoDaArea (float x, float y){
        
        this.z=(float)((x*y)/2.0);

        return(z);

    }

    public void imprimeDados(){

        System.out.println("Base: " + x + "\nAltura: " + y + "\nÁrea: " + z);

    }


}