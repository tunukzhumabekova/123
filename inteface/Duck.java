package inteface;

public class Duck implements Swimable{
    private String name;
    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
