import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList();
        System.out.println("How much length you want");
        Scanner sc =new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int element;
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            element= sc.nextInt();
            arrayList.add(element);
        }
        System.out.println(arrayList);
         arrayList.remove(n-1);
        System.out.println(arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);


    }
}
