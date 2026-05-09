package EX09;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {}

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "Cargo: Desenvolvedor\nNome: " + getNome() + "\nSalario: " + getSalario() + "Bonificacao: " +
                getBonificacao() + "\n";
    }
}
