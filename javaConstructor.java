class Car{
    private int age;
    private String name;
  public  Car(){
      age=12;
      name="Nabin";
      System.out.println(age+" "+name);
    }


    public  Car(int a){
        int age =a;
        System.out.println(a);

    }

    public  Car(int a,int b){
        int e =a;
        int f=b;
        System.out.println(e + f);
    }

    public Car(Car car){
      int d= car.age;
        System.out.println(d);
    }

}


public class javaConstructor {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(4);
        Car c2 = new Car(4,6);
        Car c3 = new Car(c1);
    }
}
