package EX13;

public abstract class Funcionario {
    private String nome, cpf;
    private double salarioBase;

    public abstract double calcularSalarioFinal();
    public abstract void exibirDados();

    public Funcionario() {}

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nCpf: " + getCpf() + "\nSalario: " + getSalarioBase();
    }
}
