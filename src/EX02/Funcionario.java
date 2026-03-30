package EX02;

public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nCargo: " + this.cargo + "\n";
    }
}