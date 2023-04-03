public class ExemploPolimorfismo2 {
    public static void main(String[] args) {
        Pessoa s;
        s = new Aluno("Leo", "12345");

        //System.out.println("RGM = " + s.getRGM());
        //erro pois a classe de referencia de s será a classe Pessoa
        //que não tem o método getRGM 
        //solução = usar o Casting
        System.out.println("RGM = " + ((Aluno)s).getRgm());
    }
}
