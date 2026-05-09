package EX09;

public class Gerente extends Funcionario {

    public Gerente() {}

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }

    @Override
    public String toString() {
        return "Cargo: Gerente\nNome: " + getNome() + "\nSalario: " + getSalario() + "\nBonificacao: " +
                getBonificacao() + "\n";
    }
}
