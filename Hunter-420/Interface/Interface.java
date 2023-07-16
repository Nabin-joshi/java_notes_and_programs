package Interface;

/*
Notes on Interfaces:
----------------------
Like abstract classes, interfaces cannot be used to create objects (in the example above,
it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
However, it can be achieved with interfaces, because the class can implement multiple interfaces.

Note: To implement multiple interfaces, separate them with a comma (see example below).
 */

interface BEIT{
    int a =10;
    public void useLaptop();
    public void knowGit();
    abstract public void ai(int a);
};
interface extraBEIT extends BEIT{
    public void stackoverflow();
    static void java(){
        System.out.println("know java");
    }
};

class Implement implements extraBEIT{

    @Override
    public void useLaptop() {
        System.out.println("Laptop used");
    }

    @Override
    public void knowGit() {
        System.out.println("Know Git");
    }

    @Override
    public void stackoverflow() {
        System.out.println("Account on stack overflow");
    }

    @Override
    public void ai(int a){
        System.out.println("know AI "+a+"%");
    }

};

class Use{
    public static void main(String[] args) {
        Implement imple = new Implement();
        imple.knowGit();
        imple.stackoverflow();
        imple.useLaptop();
        imple.ai(99);
//        imple.a=44;
        System.out.println(imple.a);
        extraBEIT.java();



    }
};

