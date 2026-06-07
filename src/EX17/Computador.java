package EX17;

public class Computador implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("O computador foi ligado");
    }
    @Override
    public void desligar() {
        System.out.println("O computador foi desligado");
    }
}
