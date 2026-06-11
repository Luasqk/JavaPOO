package Recursividade;

import java.util.ArrayList;
import java.util.List;

class Pessoa {
    String nome;
    List<Pessoa> amigos = new ArrayList<>();

    Pessoa(String nome) {
        this.nome = nome;
    }
}

public class Main {



    public static void main(String args[]) {

        //isso tambem é um grafo, mas no caso, o objeto é guardado, nao apenas os nomes
        Pessoa lucas = new Pessoa("Lucas");
        Pessoa maria = new Pessoa("Maria");
        Pessoa julia = new Pessoa("Julia");

        lucas.amigos.add(maria);
        lucas.amigos.add(julia);

        maria.amigos.add(lucas);
        julia.amigos.add(lucas);

        for (Pessoa p : lucas.amigos) {
            System.out.println(p.nome);
        }
    }
}
