package Interface;




//class - class -> extends
//class-interface ->implements
//interface - interface ->extends


interface In{

    //interface is used for design
    //for example if you want to go anywhere i can give you the path
    //but inorder to reach there you actually have to walk through it
    //every method inside the interface must be defined in class that implements it

    int a = 0; //we can declare/initilize a variable but by default it is final and static
    void show();
    void config();

    //we can define method in the interface by making it static and can be called using interface name
    static void ishow(){
        System.out.println("isShow");
    }

    //and we can also define the function making it default
    //and it can be called by the object of the class that implements the interface
    default void iconfig(){
        System.out.println("iConfig");
    }

}

// this is how we can extends interface ie interface within the interface but
//we have to define all the methods within both the interfaces
interface Ni extends In{
    public void in();
}

class JIn implements Ni{

    @Override
    public void show() {
        System.out.println("in Show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    @Override
    public void in() {
        System.out.println("in in");
    }
}


interface D {
    public void d();
}

//this is how we can implement multiple interfaces but as same
//we have to define the methods in both the interfaces
public class Lab implements In,D {

    public static void main(String[] args) {
        Lab javaInterface = new Lab();
        javaInterface.config();
        javaInterface.show();

        In.ishow();

        javaInterface.iconfig();


        JIn jIn = new JIn();
        jIn.in();
        jIn.config();
        jIn.show();
        jIn.iconfig();
        //here we cannot call ishow() because it is static

//        Developer developer= new Developer();
//        laptop laptop = new laptop();
//        laptop.code();

    }

    @Override
    public void show() {
        System.out.println("Show");
    }

    @Override
    public void config() {
        System.out.println("Config");
    }

    @Override
    public void d() {
        System.out.println("d");
    }
}