import java.lang.reflect.Array;
import java.util.*;

public class array {
    public static void main(String[] args) {
//  int nums[][] = new int[3][4];
  int nums[] = {1,2,4,5,4,3,5,7};
        int length = nums.length;
        String name= "Nabin";
       int stringName =name.length();
        System.out.println(length+stringName);


//  jagged array
  int jag[][] = new int[3][];
  jag[0]=new int[3];
  jag[1] = new int[4];
  jag[2] = new int[2];
//
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++) {
//                nums[i][j] = (int) (Math.random() *10);
//            }
//        }
//
//
//    for(int i=0;i<3;i++){
//        for(int j=0;j<4;j++){
////            i=j;
//            System.out.print(nums[i][j] +" ");
//        }
//        System.out.println(" ");
//    }
//
//    for(int n[]:nums){
//        for(int m:n){
//            System.out.print(m + " ");
//        }
//        System.out.println();
//    }

                for(int i=0;i<jag.length;i++){
            for(int j=0;j<jag[i].length;j++) {
                jag[i][j] = (int) (Math.random() *10);
            }
        }

            for(int i=0;i<jag.length;i++){
        for(int j=0;j<jag[i].length;j++){
//            i=j;
            System.out.print(jag[i][j] +" ");
        }
        System.out.println(" ");
    }


////        taking input from user
//        int m,n,j,i;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the no of rows");
//        m=sc.nextInt();
//        System.out.println("enter the no of Column");
//        n=sc.nextInt();
//
//
//        int arr[][] = new int[m][n];
//
//        System.out.println("enter the element of array");
//        for ( i=0;i<m;i++){
//            for (j=0;j<n;j++){
//                arr[i][j]= sc.nextInt();
//            }
//        }
//
//        for ( i=0;i<m;i++){
//            for (j=0;j<n;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

        int m,i;
        Scanner sc =new Scanner(System.in);
        m=sc.nextInt();


        int arr[]=new int[m];

        for (i=0;i<m;i++){
            System.out.println("enter element " + i);
            arr[i] = sc.nextInt();
        }

        for (i=0;i<m;i++){
            System.out.print(arr[i]);
        }



//        int [] arr1 = {10, 20, 30, 40, 50};
//        reverse(arr1, arr1.length);
//
//        }
//    static void reverse(int a[], int n)
//    {
//        int[] b = new int[n];
//        int j = n;
//        for (int i = 0; i < n; i++) {
//            b[j - 1] = a[i];
//            j = j - 1;
//        }
//
//        // printing the reversed array
//        System.out.println("Reversed array is: \n");
//        for (int k = 0; k < n; k++) {
//
//            System.out.println(b[k]);






    }
}

