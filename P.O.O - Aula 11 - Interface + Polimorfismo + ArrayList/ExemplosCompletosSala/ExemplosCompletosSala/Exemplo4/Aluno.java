
import javax.swing.JOptionPane;

public class Aluno {
    private String rgm;
    private float media;

    public Aluno() {
    }  

    public Aluno(String rgm, float media) {
        this.rgm = rgm;
        this.media = media;
    } 
    

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }

    public void leitura() {
        rgm = JOptionPane.showInputDialog("Digite o RGM: ");
        media = Float.parseFloat(
            JOptionPane.showInputDialog("Digite a média: "));
    }    

    public void print() {
        String saida = " RGM: " + rgm;
        saida += "\nMédia: " + media;
        System.out.println("Dados do aluno: \n" + saida);
    }
}
