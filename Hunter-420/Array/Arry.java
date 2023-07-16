package Array;
import java.util.Arrays;


public class Arry {
    public static void main(String[] args) {
      int[] numbers = new int[5];
      numbers[0] = 12345;
      numbers[1]= 20;
      numbers[2]= 30;
      numbers[3]= 40;
      numbers[4]= 50;

//      convert number to string
        String count = String.valueOf(numbers[0]);
        System.out.println(count.length());

        int len = Integer.valueOf(count);
        System.out.println(len);

        boolean status = Arrays.stream(numbers).anyMatch(x -> x == 12345);
      System.out.println(status);


    }
}
