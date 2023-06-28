package polymorphism;


class A{
    public int sum (int a, int b){
        return a+b;
    }

    public void display(){
        System.out.println("This is Parent Class");
    }
}

class B extends A{
    public int sum(int a, int b, int c  ){
        return a+b+c;
    }

    public void display(){
        super.display();
        System.out.println("This Is Child Class");
    }
}

public class test {

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.sum(10,20,30);

    }
}
