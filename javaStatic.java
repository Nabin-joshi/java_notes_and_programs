class Mobile{
    String brand;
    int price;
   static String name;

    public void show(){
        System.out.println(brand+" "+ price+ " "+name);
    }

}

public class javaStatic {
    public static void main(String[] args) {
        Mobile obj= new Mobile();
        obj.brand="Apple";
        obj.price=1500;
        obj.name="Smart Phone";

        Mobile obj1= new Mobile();
        obj1.brand="Samsung";
        obj1.price=1000;
        obj1.name="Android Phone";

        obj.name="Phone";

        obj.show();
        obj1.show();
    }
}
