package EX19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o nome do titular da conta: ");
            String titular = sc.nextLine();

            System.out.println("Digite o saldo inicial: ");
            double saldo = sc.nextDouble();

            ContaBancaria contaBancaria = new ContaBancaria(titular, saldo);

            System.out.println("Digite um valor para sacar: ");
            double valor = sc.nextDouble();

            contaBancaria.sacar(valor);

            System.out.println(contaBancaria);

        }catch (InputMismatchException e) {
            System.out.println("Erro: digite numeros no saldo");
        }
        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
