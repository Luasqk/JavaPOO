package EX16;

public class PagamentoBoleto implements Pagamento {
    @Override
    public void formaDePagamento() {
        System.out.println("Pagamento por boleto\n");
    }
}
