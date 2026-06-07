package EX18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("\nDigite o nome: ");
            String nome = sc.nextLine();

            System.out.println("\nDigite o preco; ");
            double preco = sc.nextDouble();

            ProdutoFisico p = new ProdutoFisico(nome,preco);

            System.out.println(p);
            p.vender();

        }catch (ValorException ex){
            System.out.println(ex.getMessage());
        }

    }
}

