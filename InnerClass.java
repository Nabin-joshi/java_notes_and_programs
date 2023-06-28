class I{

    int age;

    public void show(){
        System.out.println("Hello");
    }

    class N{
        public void config(){
            System.out.println("Config");
        }

    }

    static class c{
        public void cshow(){
            System.out.println("hello");
        }
    }

public void showString(){
    System.out.println("hello from local inner class");
    class localInnerClass{
        void print(){
            System.out.println("print");
        }
    }

//    localInnerClass localInnerClass = new localInnerClass();
//    localInnerClass.print();
}

}



public class InnerClass {
    public static void main(String[] args) {
        I i = new I();
        i.show();
        //inner class is the concept of class inside the class
        //if we want to access the method of inner class we have to specify
        //that the class belongs to I and call it's method
        //or we can make it static so that we can call it by class name

        I.N obj = i.new N();
        obj.config();

        //calling static inner class
        //static class is not available for non inner class
        I.c ob = new I.c();
        ob.cshow();

        i.showString();

    }
}
