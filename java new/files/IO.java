package files;

import java.io.IOException;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws IOException {
        int i = System.in.read();
        System.out.println(i);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

       int num = sc.nextInt();
        System.out.println(num);



    }
}
