 class E extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hello");
        }
    }
}

class F extends Thread
{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("hello1");
        }
    }
}


public class threads {
    public static void main(String[] args) {
        E obj1 = new E();
        F obj2 = new F();

        obj1.start();
        obj2.start();
    }
}
