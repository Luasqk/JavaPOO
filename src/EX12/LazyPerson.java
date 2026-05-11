package EX12;

public class LazyPerson extends Person {
    @Override
    public void eat(){
        System.out.println("I have an unbalanced diet with high fat and low protein.");
    }
    @Override
    public void exercise() {
        System.out.println("I don't do any exercise.\n");;
    }
}
