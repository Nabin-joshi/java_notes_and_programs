import java.util.ArrayList;

class Simple2{}
class test2{}

class test1 {
    void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());

    }
}

    public class test {
    public static void main(String[] args) throws Exception {

//        forName() method of Class class
        Class c = Class.forName("Simple");
        System.out.println(c.getName());
        System.out.println(c.isInterface());

//        getClass() method of Object class
        Simple2 s = new Simple2();
        test2 t = new test2();
        test1 obj = new test1();
        obj.printName(s);
        obj.printName(t);

//        .class
        Class d = boolean.class;
        System.out.println(d.getName());
        Class c2 = test.class;
        System.out.println(c2.getName());
    }
}
