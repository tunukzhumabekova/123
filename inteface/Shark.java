package inteface;

public class Shark implements Swimable {
    private String name;
    @Override
    public void swim() {
        System.out.println("Shark can swim" );
    }
}
