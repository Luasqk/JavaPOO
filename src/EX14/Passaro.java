package EX14;

public class Passaro extends Animal {

    public Passaro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom(){
        System.out.println("Piu Piu");
    }

    @Override
    public void mover(){
        System.out.println("O pássaro está voando");
    }
}
