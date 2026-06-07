package EX19;

public class ContaBancaria {
    private Double saldo;
    private final String titular;

    public ContaBancaria(String titular, double saldo) throws ContaException{
        if(saldo < 0) {
            throw new ContaException("O saldo inicial deve ser positivo");
        }
        if (titular.isEmpty()) {
            throw new ContaException("Titular nulo");
        }
        this.saldo = saldo;
        this.titular = titular;
    }
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new ContaException("Não é possivel sacar um valor negativo ou igual a 0");
        }
        if (valor <= saldo) {
            saldo -= valor;
        }
        else  {
            throw new ContaException("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nSaldo: " + saldo;
    }
}
