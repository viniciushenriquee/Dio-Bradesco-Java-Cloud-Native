package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno filipe = new Aluno();
        filipe.setNome("Felipe junior");
        filipe.setIdade(12);
        System.out.println("o aluno " + filipe.getNome() + " tem " + filipe.getIdade() + " anos");
    }   
}
