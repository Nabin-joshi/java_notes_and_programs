import java.util.Scanner;

public class findGreatestNumber {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Enter 4 Numbers");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
//        if(a>b){
//            if(a>c){
//                System.out.println("A is greater");
//            }
//        } else if (b>c) {
//            System.out.println("B is greater");
//
//        }else {
//            System.out.println("C is greater");
//        }
        
        if (a>b){
            if (a>c){
                if(a>d){
                    System.out.println("A is greater");
                }else {
                    System.out.println("d is greater");
                }
            }
        } else if (b>c) {
            if (b>d){
                System.out.println("B is greater");
            }else {
                System.out.println("d is greater");
            }
        } else if (c>d) {
            System.out.println("c is greater");
            
        }else {
            System.out.println("c is greater");
        }

    }
}
