package EX17;

public class SistemaEletronicos {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Televisao televisao = new Televisao();
        VideoGame videoGame = new VideoGame();

        System.out.println("\n- - - Computador - - - -\n");
        computador.ligar();
        computador.desligar();

        System.out.println("\n- - - Televisao - - - -\n");

        televisao.ligar();
        televisao.desligar();

        System.out.println("\n- - - Video Game - - - -\n");

        videoGame.ligar();
        videoGame.desligar();

    }
}