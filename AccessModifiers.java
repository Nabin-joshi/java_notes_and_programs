class Ac{
    protected int a;
    private int x=10;

    public int getA() {
        return a;
    }

    public int getX() {
        return x;
    }

    public void show(){
        System.out.println(a);
    }
}

public class AccessModifiers {

//    public can be accessed from anywhere
//    private can only be accessed within the class not even on the same package
//    if we do not provide any access specifier then it is default,default simply means we can access it within the same package
//    protected can be used in same class subclass different package subclass,but not in different package non subclass

    public static void main(String[] args) {
        Ac ac = new Ac();
        ac.a=10;
        System.out.println(ac.getX()); ;
        ac.show();

    }
}
