package EX20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite o numero do pedido: ");
            int numeroPedido = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome do cliente: ");
            String cliente = sc.nextLine();

            System.out.println("Digite o valor do pedido: ");
            double valorCompra = sc.nextDouble();

            System.out.println("O pedido e nacional ou internacional? ");
            System.out.println("1-Nacional\n2-Internacional");
            int tipoPedido = sc.nextInt();

            Pedido pedido;

            if(tipoPedido == 1){
                pedido = new PedidoNacional(
                        numeroPedido,
                        cliente,
                        valorCompra,
                        StatusPedido.AguardandoPagamento);

                System.out.println("Dados iniciais: ");
                pedido.exibirDados();

                System.out.println("==========================");
                System.out.println("Realizando pagamento. . .");
                System.out.println("==========================");
                pedido.alterarStatus();
                pedido.exibirDados();

            }

            else{
                pedido = new PedidoInternacional(
                        numeroPedido,
                        cliente,
                        valorCompra,
                        StatusPedido.AguardandoPagamento);

                System.out.println("Dados iniciais: ");
                pedido.exibirDados();

                System.out.println("==========================");
                System.out.println("Realizando pagamento. . .");
                System.out.println("==========================");
                pedido.alterarStatus();
                pedido.exibirDados();

            }

        }catch(InputMismatchException e){
            System.out.println("Digite apenas numeros no valor da compra. ");

        }catch(PedidoException e){
            System.out.println(e.getMessage());
        }
    }
}
