class par{
    public void show(){
        System.out.println("A");
    }
}

class Chi extends par{

    public void show(){
        System.out.println("B");
    }

}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        par p = new Chi(); //this will class show of base class
        p.show(); //this is because of method overriding

        p= new Chi();
        p.show();
//        the main concept is to define the reference variable as type of parent class but the implementation of child class

// referring the object as the parent class
//        for example
//        class computer{}
//        class laptop extends computer{}
//        if we create a object like laptop obj = new laptop();
//        obj is the laptop but laptop is a computer ie
//        we can refer laptop object as a computer
//        computer obj = new laptop
//        type of parent but object of child class
        par pa = new par();
        pa.show();
    }

}
