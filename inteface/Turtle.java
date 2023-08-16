package inteface;

public class Turtle implements Swimable{
    private String name;
    @Override
    public void swim() {
        System.out.println("Turtle can swim");
    }
}
