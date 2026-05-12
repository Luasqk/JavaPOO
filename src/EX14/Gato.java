package EX14;

public class Gato extends Animal{

    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau Miau");
    }

    @Override
    public void mover(){
        System.out.println("O gato está se movendo");
    }
}
