
class AnObject{

    public AnObject(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("base Class");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new AnObject();
        new AnObject().show(); //this is anonymous object
        //An anonymous object is the object without name
//        if their is a reference name in the object that is reference object
//        the main problem with the anonymous object is that it is not reusable
//        and it is also stored in heap memory

    }
}
