enum Status{
    Running,Failed,Pending,Success
}

enum laptop1{
    Mackbook(2000),XPS(3000),Surface(4000),ThinkPad;

    private int price;

    laptop1() {
        price=500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    laptop1(int price) {
        this.price = price;
    }
}

public class Enum {
    
    public static void main(String[] args) {

        Status s = Status.Running;
        Status status = Status.Success;
        System.out.println(s);
        System.out.println(status);
        System.out.println(status.ordinal());

        Status[] newStatus = Status.values();
       for(Status obj : newStatus){
           System.out.println(obj + " " + obj.ordinal() + " "+ obj.name());
       }

       if(s== Status.Running){
           System.out.println("Running");
       } else if (s==Status.Success) {
           System.out.println("Success");
       }else {
           System.out.println("Nothing");
       }

       switch (s){
           case Failed :
               System.out.println("Failed");
               break;
           case Running:
               System.out.println("Running");
               break;
           case Success:
               System.out.println("Success");
               break;

           default:
               System.out.println("Done");
               break;



       }

       laptop1 lap = laptop1.Mackbook;
        System.out.println(lap + " " + lap.getPrice());

        laptop1[] obj = laptop1.values();

        for(laptop1 ob : obj){
            System.out.println(ob.name() + "  " +ob.getPrice() );
        }




    }

}
