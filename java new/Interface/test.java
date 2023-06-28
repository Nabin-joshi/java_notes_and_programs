package Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

interface BEIT{
    void computerInterset();

    void computerKnowledge();

    boolean mathKnowledge(boolean value);

    default void display() {
        System.out.println("display");
    }

    static void test2(){
        System.out.println("test 2");
    }
}




public class test implements BEIT {
    @Override
    public void computerInterset() {
        System.out.println("computer Interest");
    }

    @Override
    public void computerKnowledge() {
        System.out.println("Computer Knowledge");

    }

    @Override
    public boolean mathKnowledge(boolean value) {
        return value;
    }

    public static void main(String[] args) {
        test obj = new test();
        obj.computerInterset();
        obj.computerKnowledge();
        System.out.println( obj.mathKnowledge(true));
        obj.display();

        BEIT.test2();

    }



}
