package EX09;

public class Secretaria extends Funcionario{

    public Secretaria(){}

    public Secretaria(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.12;
    }

    @Override
    public String toString() {
        return "Cargo: Secretaria\nNome: " + getNome() + "\nSalario: " + getSalario() + "\nBonificacao: " +
                getBonificacao();
    }
}
