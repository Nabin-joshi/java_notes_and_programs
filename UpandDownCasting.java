class Up{
    public void show(){
        System.out.println("Up");
    }
}

class Down extends Up{
    public void DownShow(){
        System.out.println("Down");
    }

}

public class UpandDownCasting {
    public static void main(String[] args) {
        Up up =new Down(); // this is up_casting ie casting the object to parent class
        up.show(); // In this type of case parent class doesn't know about the method of child class
        //but in real life your parent knows you not every thing that's for sure
        //hence casting is use

        Down down = (Down) up; //this is down casting
        down.DownShow();

    }
}
