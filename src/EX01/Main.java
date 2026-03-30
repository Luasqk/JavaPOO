package EX01;

public class Main {
    static void main() {
        Disciplina disciplina = new Disciplina("Matemática", (double)270.0F);
        Professor professor = new Professor("Anderson", disciplina);
        professor.exibirDados();
    }
}