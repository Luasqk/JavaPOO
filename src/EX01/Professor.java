package EX01;

public class Professor {
    private String nome;
    private Disciplina disciplina;

    public Professor(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        String var10001 = this.nome;
        System.out.println("Nome: " + var10001 + String.valueOf(this.disciplina));
    }
}