class Human{
//    encapsulation is done with access specifier
//   every time you create a instance variable make it private
  private   int age;
  private String name;


//  private variables can only be accessed through method only mainly getter setter
//    initially private variable is for that particular class

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    int age;
//    String name;
}

public class encapsulaton {
    public static void main(String[] args) {
        Human obj =new Human();
        obj.setAge(12);
        obj.setName("Nabin");
        System.out.println(obj.getAge() +" : "+obj.getName());
//        obj.age=12;
//        obj.name="Nabin";
//        System.out.println(obj.age);

    }
}
