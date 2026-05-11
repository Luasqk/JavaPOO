package EX12;

//8. Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
// Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
// to describe how each person eats and exercises.

public class Main {
    public static void main(String[] args) {
        LazyPerson lazyPerson = new LazyPerson();
        Athlete athlete = new Athlete();

        System.out.println("- - - Lazy Person - - -");
        lazyPerson.eat();
        lazyPerson.exercise();

        System.out.println("- - - Athlete - - -");
        athlete.eat();
        athlete.exercise();
    }
}
