package EX13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionario = new ArrayList<>();
        Funcionario prof = new Professor("Renato","0123456789",2800,15,30);
        Funcionario coor = new Coordenador("Maria","9876543210",3000,300);
        Funcionario tec = new TecnicoAdministrativo("Guilherme","7893216540",2700,300);

        funcionario.add(prof);
        funcionario.add(coor);
        funcionario.add(tec);

        System.out.println("\n- - - - - - - - - - - -");
        System.out.println("Lista De funcionarios: ");
        System.out.println("- - - - - - - - - - - -\n");

        for(Funcionario f : funcionario) {
            f.exibirDados();
            System.out.println("- - - - - - - - - -");
        }
    }
}
