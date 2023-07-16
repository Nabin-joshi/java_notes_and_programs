package Polymorphism;

/*
   Polymorphism means "many forms", and it occurs when we have many classes
   that are related to each other by inheritance.

Inheritance inherit
attributes and methods from another class. Polymorphism uses those methods to perform different tasks.
This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound().
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal
sound (the pig oinks, and the cat meows, etc.):
 */
class Animall{
    public void AnimalSound(){
        System.out.println("Animal Sound");
    }
};

class Catt extends Animall{
    public void size(){
        System.out.println("small");
    }


    //Can we override private method
    public void AnimalSound(String sound){
        System.out.println(sound);
    }
};

class Elephantt extends Animall{
    public void size(){
        System.out.println("big");
    }
};
public class PolyNormal {
    public static void main(String[] args) {

        Catt cat= new Catt();
        cat.AnimalSound("Meow");
        cat.size();

        Elephantt elephant = new Elephantt();
        elephant.AnimalSound();
        elephant.size();
    }
}
