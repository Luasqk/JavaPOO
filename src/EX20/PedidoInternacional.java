package EX20;

import static EX20.StatusPedido.Pago;

public class PedidoInternacional extends Pedido implements Pagamento{

    public PedidoInternacional(int numeroPedido, String cliente, double valorCompra, StatusPedido status) {
        super(numeroPedido, cliente, valorCompra, status);
    }

    @Override
    void alterarStatus(){
        status = Pago;

    }

    @Override
    public void realizarPagamento() {
        alterarStatus();
    }
}
