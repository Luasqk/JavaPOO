package EX20;

abstract class Pedido {
    int numeroPedido;
    String cliente;
    double valorCompra;
    StatusPedido status;

    public Pedido(){}

    public Pedido(int numeroPedido, String cliente, double valorCompra, StatusPedido status) {
        if(numeroPedido <= 0){
            throw  new PedidoException("Valor invalido: numeros negativos nao sao permitidos. ");
        }
        if(numeroPedido > 50000){
            throw new PedidoException("Valor invalido: numero maior que o limite permitido (50.000).");
        }

        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.valorCompra = valorCompra;
        this.status = status;
    }

    public void exibirDados() {
        double frete = valorCompra * 0.1;
        double total = valorCompra + frete;

        System.out.println("= = = = = = = = = = = = = = = = =");
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Frete: " + frete);
        System.out.println("Total: " + total);
        System.out.println("Status: " + status);
    }
    abstract void alterarStatus();
}
