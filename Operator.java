import java.util.Arrays;

public class Operator {
    public static void main(String[] args) {
//        increment and decrement operator
//        find even and odd numbers
        for (int i=0;i<10;i++){
            System.out.print(i++);
        }
        for (int i=0;i<10;i++){
            System.out.print(++i);
        }
        for (int i=0;i<10;i++){
            i=i+1;
            System.out.println(i);
        }
//        ternary operator
//        (a>b?b:a); this is defined as if a>b then return b else a
        int a=10,b=20,c=5;
        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(result +" ternary operator");
        Operator operator = new Operator();
       int total= operator.add(10,20);
        System.out.println(total);
       total= sum(10,20);
        System.out.println(total);
    }
   private int add(int a,int b){
       int sum;
       sum=a+b;
        return sum;
    }
    private static int sum(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }
}
