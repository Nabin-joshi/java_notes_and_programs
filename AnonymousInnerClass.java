class AN{
    public void show(){
        System.out.println("hello");
    }
}

abstract class IC{
    public abstract void show() ;
    public abstract void config();
}

//class CI extends IC{
//
//}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //this is the example of anonymous class
        //we can define a method within the object and call it within the object

        AN obj = new AN(){
            //this is the class
            //this will call the implementation of new class
            @Override
            public void show() {
                System.out.println("Anynomous class");
            }

        };

        obj.show();

        //this is the abstract class and inner class concept
        //ie whenever we want to have abstract class we have to extends it to a base class
        //the base class has to just implement the abstract methods nothing else
        //but the only purpose of it to define a method we can use the concept of anonymous inner class
        //like this below
        //we can define a function and call it
        //here we are not creating the object of abstract class we cannot do that
        //we are creating the object of anonymous class
        //this can also be use for interface


        IC obj1 = new IC() {
            @Override
            public void show() {
                System.out.println("hello");
            }

            @Override
            public void config() {
                System.out.println("Config");
            }
        };

        obj1.show();
    }
}
