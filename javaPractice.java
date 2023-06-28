import java.util.Scanner;

public class javaPractice {
    int a=10;
    static double b=20.5;
    public static void main(String[] args) {

        javaPractice obj = new javaPractice();
        obj.marks();

        boolean isLoggedin =true ;
        javaPractice javaPractice=new javaPractice();
        System.out.println(javaPractice.a);
        System.out.println(javaPractice.b);
        if(isLoggedin=true){
            System.out.println("success    "+ javaPractice.a);
        }else {
            isLoggedin=false;
        }

        int a,b,c;
        System.out.println("Enter Any two no");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.println("the output is " + c);

    }

    public float marks(){
        int Sc,Mt,Cs,Ed,Pb;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name ");
        name =sc.nextLine();
        System.out.println("enter your science marks");
        Sc=sc.nextInt();

        System.out.println("enter your Math marks");
        Mt = sc.nextInt();

        System.out.println("enter your Computer marks");
        Cs = sc.nextInt();

        System.out.println("enter your Electronic marks");
        Ed = sc.nextInt();

        System.out.println("enter your Programming marks");
        Pb = sc.nextInt();


        int total = 500;

        float marks = Mt+Cs+Sc+Ed+Pb;
        marks = (marks/total)*100;
        System.out.println(name+ " Your Total Percentage is "+marks +" %");

        return marks;

    }


}
