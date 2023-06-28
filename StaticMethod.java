
class outsideClass{
    String brand;
    int price;
    static String name;
//    static block bhitra static variable or method matrai use gafrna painxa
    static {
        System.out.println("hello");
        name="phone";
    }
//    If we change the value of the static variable inside the constructor all the other methods that are implementing the static variable will change their value

    public outsideClass(){
        brand="";
        price=200;
        name="nabin";
        System.out.println(name+price);
    }

    public void outsideclass(){
        brand="";
        price=200;
        System.out.println(price);
        System.out.println(name);
    }

//    this is how non static variable can be accessed in static method
    static void method(outsideClass obj){
        System.out.println("hello "+ name + obj.price);
    }

}


public class StaticMethod {
    public static void main(String[] args) throws ClassNotFoundException {

//       but the best part is when the class is loaded ststic block runs
//        Hence static will run first then instance then constructor then method
        //      this is used for loading the class without creating the object
//        try {
//            Class.forName("outsideClass");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        outsideClass obj1= new outsideClass();
//        outsideClass.method();
        obj1.outsideclass();
        obj1.brand="Samsung";
        obj1.price=400;
        outsideClass.method(obj1);

    }
}
