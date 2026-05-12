package EX13;

public class TecnicoAdministrativo extends Funcionario {
    private double auxilioTransporte;

    public TecnicoAdministrativo(String nome, String cpf, double salarioBase, double auxilioTransporte) {
        super(nome, cpf, salarioBase);
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + auxilioTransporte;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nCargo: Tecnico Administrativo");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Auxilio Transporte: " + auxilioTransporte);
        System.out.println("\nSalario final: " + calcularSalarioFinal() + "\n");

    }
}
