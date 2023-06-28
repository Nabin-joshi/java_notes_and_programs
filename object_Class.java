import javax.crypto.spec.PSource;

class Computer{
    public void playMusic(){
        System.out.println("Play Music");
    }

    public int sum(int n){
        return n+1;
    }
    public void display(){
        System.out.println("Hello1");
    }

}

public class object_Class extends Computer {
    public static void main(String[] args) {
Computer obj = new Computer();
obj.playMusic();
obj.display();
int result=obj.sum(5);
        System.out.println(result);
        object_Class objectClass =new object_Class();
        objectClass.display();
    }
    public void display(){
        System.out.println("Hello");
    }

}
