import java.security.spec.ECField;

public class javaException {

    public static void main(String[] args) {
        System.out.println(print(0));
    }
    static Exception print(int i){
        if(i>0){
            System.out.println(new Exception());
            return new Exception();
        }else {
            System.out.println(new RuntimeException());
throw new RuntimeException();
        }
    }
}

