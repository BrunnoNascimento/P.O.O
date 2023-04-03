import javax.swing.JOptionPane;

public class boletim {
    //atributos
    double n1;
    double n2;
    double media;

    //construtor com parâmetro que não recebe a média como parâmetro
    public boletim(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    //imrpime boletim/dados que não tem retorno
    public void imprimeBoletim(){
        JOptionPane.showMessageDialog(null,
        "Nota 1:" + n1 + 
        "\nNota 2: " + n2 +
         "\nMedia: "  + media);
    }

    public void calculaMedia(){
        media = (this.n1 + this.n2)/2;
    }

    public String verificaConceito(){
        String conceito = "";
        if(media == 8 && media <= 10){
            conceito = "A";
        }
        else{
            if(media >= 6){
                conceito = "B";
            }
            else{
                if(media >= 4){
                    conceito = "C";
                }
                else{
                    conceito = "D";
                }
            }
        }
        return conceito;
    }

}
