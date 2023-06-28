
class anno1{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Hello");
    }
}

class anno2 extends anno1{

    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("B");
    }
}

public class Annotattion {
    public static void main(String[] args) {
        anno2 aa = new anno2();
        aa.showTheDataWhichBelongsToThisClass();
    }
}
