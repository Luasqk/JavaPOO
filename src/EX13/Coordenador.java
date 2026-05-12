package EX13;

public class Coordenador extends Funcionario {
    private double gratificacao;

    public Coordenador(String nome, String cpf, double salarioBase, double gratificacao) {
        super(nome, cpf, salarioBase);
        this.gratificacao = gratificacao;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + gratificacao;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nCargo: Coordenador");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Gratificacao: " + gratificacao);
        System.out.println("\nSalario final: " + calcularSalarioFinal() + "\n");

    }
}
