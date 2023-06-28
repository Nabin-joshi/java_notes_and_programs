public class demo {
    int sum(int a,int b){
        int c = a+b;
        return c;
    }

    static int diff(int c,int d){
        int e = c-d;
        return e;
    }

    public static void main(String[] args) {
        demo demo = new demo();
        int total = demo.sum(10,20);

        int diff = diff(10,30);

        System.out.println(total);
        System.out.println(demo.sum(10,20));

        System.out.println(diff);
        System.out.println(diff(40,30));
    }
}
