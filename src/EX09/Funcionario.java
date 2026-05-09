package EX09;

public class Funcionario {
    private String nome;
    private Double salario;

    public double getBonificacao(){
        return getSalario() * 0.1;
    }

    public Funcionario() {}

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo: Funcionario\nNome: " + getNome() + "\nSalario: " + getSalario() +"Funcionario Registrado" +"\nBonificacao: " +
        getBonificacao() + "\n";
    }
}
