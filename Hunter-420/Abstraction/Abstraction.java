package Abstraction;

abstract class Human{
    int a=3;
    public  void walk(){
        System.out.println("Super: walk");
    }
}

class Man extends Human{
    public void walk(){
        System.out.println("Inherite: walk");
    }

    public void hair(){
        System.out.println("own: short hair");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Man man = new Man();
        man.walk();
        man.hair();
        man.a=20;
        System.out.println(man.a);
    }
}

/*
Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.

Note: Abstraction can also be achieved with Interfaces
 */
