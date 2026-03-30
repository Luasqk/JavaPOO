package EX00;

import java.util.Scanner;

public class MainProduto {
    static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        produto.setNome(scanner.nextLine());

        do {
            System.out.println("Digite o preço do produto: ");
            produto.setPreco(scanner.nextDouble());
        } while(produto.getPreco() <= (double)0.0F);

        do {
            System.out.println("Digite a quantidade que deseja cadastrar: ");
            produto.setQuantidade(scanner.nextInt());
        } while(produto.getQuantidade() <= 0);

        System.out.println(produto);
    }
}