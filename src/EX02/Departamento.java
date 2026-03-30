package EX02;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionario;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionario = new ArrayList();
    }

    public void adicionaFuncionario(Funcionario f1) {
        this.funcionario.add(f1);
    }

    public void exibeFuncionarios() {
        System.out.println("Departamento: " + this.nome);
        int i = 1;

        for(Funcionario j : this.funcionario) {
            System.out.println(i + "-" + String.valueOf(j));
            ++i;
        }

    }
}