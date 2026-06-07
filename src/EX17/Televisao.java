package EX17;

public class Televisao implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("A televisao foi ligada");
    }
    @Override
    public void desligar() {
        System.out.println("A Televisao foi desligada");
    }
}
