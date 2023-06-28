abstract class  Abdf {
    //if we only want to declare a function and define it into another class
    //we use abstract
    // abstract function should always be in abstract class
    //it is the modular concept of OOp
    //which ever class inherit the abstract class should implement or override the abstract function
    //    we cannot create an object of abstract class


    public void show() {
        System.out.println("hell0");
    }

    public abstract void show (int a);

}

class Base extends Abdf{

    @Override
    public void show(int a) {
        System.out.println(a);
    }
}


public class AbstractClass {
    public static void main(String[] args) {

        Abdf obj = new Base() ; //creating the reference of abstract class and object of base class
    }
}
