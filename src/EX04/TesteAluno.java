package EX04;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setNota((double)8.5F);
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Nota: " + a1.getNota());
    }
}