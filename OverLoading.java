
class sum {
    public int add(int a,int b, int c ){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        sum obj = new sum();
        int result=obj.add(10,20,40);
        System.out.println(result);
    }
}
