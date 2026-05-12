package EX14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Animal cachorro = new Cachorro("Cachorro", 10, 18);
        Animal gato = new Gato("Gato", 8, 15);
        Animal passaro = new Passaro("Passaro", 3, 0.5);

        animais.add(cachorro);
        animais.add(gato);
        animais.add(passaro);

        System.out.println("- - - - Animais - - - -\n");

        for (Animal animal : animais) {
            animal.exibirDados();
            System.out.println("\n - - - - - - - - - - - - \n");
        }
    }
}
