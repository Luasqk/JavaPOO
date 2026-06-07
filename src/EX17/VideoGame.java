package EX17;

public class VideoGame implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("O video game foi ligado");
    }
    @Override
    public void desligar() {
        System.out.println("O video game foi desligado");
    }
}