package inteface;

public class MAin {
    public static void main(String[] args) {
        Duck duck=new Duck();
        duck.swim();
        Duck duck1=new Duck();
        duck.swim();
        Duck duck2=new Duck();
        duck.swim();
        Duck duck3=new Duck();
        duck.swim();
        Duck duck4=new Duck();
        duck.swim();
        Shark shark=new Shark();
        shark.swim();
        Shark shark2=new Shark();
        shark.swim();
        Shark shark3=new Shark();
        shark.swim();
        Shark shark4=new Shark();
        shark.swim();
        Shark shark5=new Shark();
        shark.swim();
        Turtle turtle=new Turtle();
        turtle.swim();
        Turtle turtle2=new Turtle();
        turtle.swim();
        Turtle turtle3=new Turtle();
        turtle.swim();
        Turtle turtle4=new Turtle();
        turtle.swim();
        Turtle turtle5=new Turtle();
        turtle.swim();
        Swimable[] okeanarium={duck,duck1,duck2,duck3,duck4,shark,shark2,shark3,shark4,shark5,turtle,turtle2,turtle3,turtle4,turtle5
        };
        System.out.println(okeanarium);
    }
}
