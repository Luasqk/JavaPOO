package EX16;

public class SistemaPagamento {
    static void main() {
        Pagamento cartao = new PagamentoCartao();
        cartao.formaDePagamento();

        Pagamento pix = new PagamentoPix();
        pix.formaDePagamento();

        Pagamento boleto = new PagamentoBoleto();
        boleto.formaDePagamento();
    }
}
