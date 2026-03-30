package EX01;

public class Disciplina {
    private String nome;
    private double cargaHoraria;

    public Disciplina(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "\nDisciplina: " + this.nome + "\nCarga Horária: " + this.cargaHoraria;
    }
}
