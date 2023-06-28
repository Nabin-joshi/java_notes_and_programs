class A{
//    every class in java extends Object class
    public A(){
//        this super refers to the Object class
        super();
        System.out.println("Default A");
    }

    public A(int a){
        System.out.println("Parameter A");
    }
}

class B extends A{
    public B(){
//        super always call the condtructor of parent class
       super(5);
        System.out.println("Default B");
    }

    public B(int n){
//        super();
//        this will always refer to the default constructor of same class
        this();
        System.out.println("Parameter B");
    }
}


public class this_super {
    public static void main(String[] args) {

        B obj= new B(5);
    }
}
