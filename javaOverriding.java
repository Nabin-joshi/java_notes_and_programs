
class   base{
    public void show(){
        System.out.println("A");
    }
}
class sub extends base{
    @Override
    public void show() {
        super.show(); //this is used to all the feature of parent class
        System.out.println("B");
    }
}


public class javaOverriding {
    public static void main(String[] args) {
sub obj= new sub();
obj.show();
    }
}
