package EX03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Computador> listaDeComp = new ArrayList();

        int escolha1;
        do {
            System.out.println("===========================");
            System.out.println("Menu Sistema");
            System.out.println("Digite 1 para criar um computador");
            System.out.println("Digite 2 para listar computadores");
            System.out.println("Digite 0 para sair");
            System.out.println("===========================");
            escolha1 = scanner.nextInt();
            scanner.nextLine();
            if (escolha1 == 1) {
                System.out.println("Digite a marca do computador: ");
                String marca = scanner.nextLine();
                Computador comp = new Computador(marca);

                String continuaPeca;
                do {
                    System.out.println("Digite o nome da peca que deseja adicionar: ");
                    String nomePeca = scanner.nextLine();
                    comp.adicionarPeca(nomePeca);
                    System.out.println("Deseja adicionar mais alguma peca? (s/n)");
                    continuaPeca = scanner.nextLine();
                } while(continuaPeca.equalsIgnoreCase("s"));

                listaDeComp.add(comp);
                System.out.println("Computador registrado com sucesso. ");
            }

            if (escolha1 == 2) {
                if (listaDeComp.isEmpty()) {
                    System.out.println("Nenhum computador encontrado. ");
                } else {
                    for(int i = 0; i < listaDeComp.size(); ++i) {
                        System.out.println(i + "-" + ((Computador)listaDeComp.get(i)).getMarca());
                    }
                }

                System.out.println("Digite o índice de um computador para imprimir na tela: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < listaDeComp.size()) {
                    ((Computador)listaDeComp.get(index)).exibirPecas();
                } else {
                    System.out.println("Indice invalido. ");
                }
            }
        } while(escolha1 != 0);

    }
}