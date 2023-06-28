interface newInterface{
//    this is how we can define a function in interface rather than only declaring the method;
     static void display(){
        System.out.println("hello");
    }
     void show();

}


public class StaticInterface implements newInterface {
    public static void main(String[] args) {
        StaticInterface obj=new StaticInterface();
        obj.show();
        newInterface.display();
    }
    @Override
    public  void show() {
        System.out.println("show");
    }
}
