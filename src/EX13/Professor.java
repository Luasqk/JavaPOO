package EX13;

public class Professor extends Funcionario {
    private int quantidadeAulas;
    private double valorPorAula;

    public Professor(String nome, String cpf, double salarioBase, int quantidadeAulas, double valorPorAula) {
        super(nome, cpf, salarioBase);
        this.quantidadeAulas = quantidadeAulas;
        this.valorPorAula = valorPorAula;
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    public double getValorPorAula() {
        return valorPorAula;
    }

    public void setValorPorAula(double valorPorAula) {
        this.valorPorAula = valorPorAula;
    }

    public double calcularSalarioFinal(){
        return getSalarioBase() + (quantidadeAulas * valorPorAula);
    };
    public void exibirDados(){
        System.out.println("\nCargo: Professor");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Quantidade de Aulas: " + getQuantidadeAulas());
        System.out.println("Valor por Aula: " + getValorPorAula());
        System.out.println("Salario: " + calcularSalarioFinal() + "\n");
    };
}
