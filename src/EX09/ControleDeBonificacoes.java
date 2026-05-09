package EX09;

import java.util.ArrayList;
import java.util.List;

public class ControleDeBonificacoes {
    private double totalBonificacoes = 0;
    private List<Funcionario> funcionarios =  new ArrayList<>();

    public void registrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double getTotalBonificacoes() {

        for (Funcionario funcionario : funcionarios) {
            totalBonificacoes += funcionario.getBonificacao();
        }
        return totalBonificacoes;
    }

    public String getNomeFuncionario(int i) {
        if (i >= 0 && i <= funcionarios.size()) {
            return funcionarios.get(i).getNome();
        }
        return null;
    }
}
