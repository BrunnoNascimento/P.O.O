public class Calcado extends Vestuario{
    private String materialsola;
    private String materialpartesuperior;
    private String materialinterno;

    //construtores com e sem parâmetros
    public Calcado() {   }

    

    public Calcado(int codigo, float valor, String nome, String cor, int i, String materialsola,
            String materialpartesuperior, String materialinterno) {
        super(codigo, valor, nome, cor, i);
        this.materialsola = materialsola;
        this.materialpartesuperior = materialpartesuperior;
        this.materialinterno = materialinterno;
    }



    //get's and set's
    public String getMaterialsola() {
        return materialsola;
    }

    public String getMaterialpartesuperior() {
        return materialpartesuperior;
    }

    public String getMaterialinterno() {
        return materialinterno;
    }

    public void setMaterialsola(String materialsola) {
        this.materialsola = materialsola;
    }

    public void setMaterialpartesuperior(String materialpartesuperior) {
        this.materialpartesuperior = materialpartesuperior;
    }

    public void setMaterialinterno(String materialinterno) {
        this.materialinterno = materialinterno;
    }
    
    public String print(){
        String saida = "Dados do calçado:" ;
        saida += super.print();
        saida += "\nMaterial da sola: " + materialsola;
        saida += "\nMaterial da parte superior: " + materialpartesuperior;
        saida += "\nMaterial da parte interna: " + materialinterno;
        return saida;
    }
}
