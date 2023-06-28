import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapCollection {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(180,"apple");
        map.put(120,"orange");
        map.put(130,"orange");
        map.put(140,"orange");
        map.put(150,"orange");
        System.out.println(map.get(120));

        Scanner sc = new Scanner(System.in);
        int rate;
        String fruit = new String();
        for(int i=0;i<2;i++){
            System.out.println("enter rate");
            rate = sc.nextInt();
            System.out.println("enter Name");
            fruit=sc.nextLine();

            map.put(rate,fruit);
        }
        System.out.println(map);
    }
}
