import java.util.Objects;

class Laptop {
    String model;
    int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public String toString(){
        return "hey";
    }
}
public class ObjectClass {
//    every class extends object class
public static void main(String[] args) {
    Laptop laptop = new Laptop();

    laptop.model="apple";
    laptop.price=40000;

    Laptop lap =new Laptop();
    lap.model="apple";

    System.out.println(lap.equals(laptop));
    //every time we want to print object ie laptop it will change it to tostring
    //toString is from Object class

    System.out.println(laptop.toString());
}

}
