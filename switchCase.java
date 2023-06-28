import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int a,b,c;
        String ch;
        System.out.println("Enter any two no");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println("Enter your choice");
        ch=sc.nextLine();
        switch (ch)
        {
            case "add":
                c=a+b;
                System.out.println(c);
                break;
            case "sub":
                c=a-b;
                System.out.println(c);
                break;
            default:
                System.out.println("error");
                 break;
        }
//        switch (ch){
//            case 1:
//                c=a+b;
//                System.out.println(c);
//                break;
//            case 2:
//                c=a-b;
//                break;
//            default:
//                System.out.println("reenter");
//                break;
//        }

    }
}
