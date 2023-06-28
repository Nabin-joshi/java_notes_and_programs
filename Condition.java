import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        int age,pwd;
        String name;
        System.out.println("Enter age ");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        name = sc.nextLine();
        System.out.println(name);
        if (age>18){
            System.out.println("You are Logged in");
            name = sc.nextLine();
            System.out.println(name);
        } else if (age==18) {
            System.out.println("Enter Password");
            pwd=sc.nextInt();
            if (pwd==123){
                System.out.println("elseIf 1");
            }else{
                System.out.println("nested");
            }

        } else if (age<=15 && age>=19) {
            System.out.println("elseIF 2");
        }else {
            System.out.println("else");
        }
    }
}
