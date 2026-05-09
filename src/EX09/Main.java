package EX09;

public class Main {
    static void main() {
        ControleDeBonificacoes cb = new ControleDeBonificacoes();
        Funcionario gerente = new Gerente("Carlos",5000.0);
        Funcionario secretaria = new Secretaria("Ana",3000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Marcos",4000.0);

        cb.registrarFuncionario(gerente);
        cb.registrarFuncionario(secretaria);
        cb.registrarFuncionario(desenvolvedor);

        System.out.println(gerente);
        System.out.println(secretaria);
        System.out.println(desenvolvedor);

        System.out.println(cb.getTotalBonificacoes());
    }
}
