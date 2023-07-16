package Polymorphism;


import java.lang.reflect.Method;

class Animal{
    private void AnimalSound(){
        System.out.println("Animal Sound");
    }
};

class Cat extends Animal{
    public void size(){
        System.out.println("small");
    }


    //Can we override private method
//    public void AnimalSound(){
//        System.out.println("Meow");
//    }
};

class Elephant extends Animal{
    public void size(){
        System.out.println("big");
    }
};
public class Poly {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        Cat cat= new Cat();
        Method m = Animal.class.getDeclaredMethod("AnimalSound");
        m.setAccessible(true);
        m.invoke(a);
//        cat.AnimalSound();
        cat.size();

        Elephant elephant = new Elephant();
//        elephant.AnimalSound();
        elephant.size();
    }
}
