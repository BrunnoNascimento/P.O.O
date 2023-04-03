public class ExemploPolimorfismo3 {
    public static void main(String[] args) {
        Pessoa s = new Pessoa ("Fulano");
        //erro pois o casting não pode ser aplicado para o objeto s
        //declarado e instanciado a partir da classe pai
        //System.out.println("RGM = " + ((Aluno)s).getRgm());

        //instanceof = verifica se o objeto s foi instanciado a partir
        //da classe Aluno
        if (s instanceof Aluno){
            System.out.println("RGM = " + ((Aluno)s).getRgm());
        }
        
    }
}
