package EX16;

public class PagamentoCartao implements Pagamento {
    @Override
    public void formaDePagamento() {
        System.out.println("Pagamento por cartão\n");
    }
}
