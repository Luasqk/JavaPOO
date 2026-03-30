package EX02;

public class Main {
    static void main() {
        Funcionario f1 = new Funcionario("Maria", "Estoquista");
        Funcionario f2 = new Funcionario("Rodrigo", "Acougueiro");
        Funcionario f3 = new Funcionario("Sofia", "Opearador de caixa");
        Departamento d1 = new Departamento("Estoque");
        Departamento d2 = new Departamento("Acougue");
        Departamento d3 = new Departamento("Atendimento");
        d1.adicionaFuncionario(f1);
        d2.adicionaFuncionario(f2);
        d3.adicionaFuncionario(f3);
        d1.exibeFuncionarios();
        d2.exibeFuncionarios();
        d3.exibeFuncionarios();
    }
}