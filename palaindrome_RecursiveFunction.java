public class palaindrome_RecursiveFunction {
    public static void main(String[] args) {
//        String name, reverse="";
//        char ch;
//        System.out.println("enter String");
//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
//        for(int i=0;i<name.length();i++){
//            ch= name.charAt(i);
//            reverse=ch+reverse;
//        }
//        System.out.println(reverse);
//        if(name.equals(reverse)){
//            System.out.println("Plaindrome");
//        }

//    for(int i=0;i<=50;i++){
//        int result=2*i + 1;
//        System.out.println(result);
//    }
int i = 0;
 while(i<=4)
 {
     System.out.println("hello");
     ++i;
 }
 palaindrome_RecursiveFunction obj = new palaindrome_RecursiveFunction();

        System.out.println(obj.sum(5));

    }
    int sum(int b){
        if(b>0){
            int result= b+ sum(b-1);
         return result ;
        }else {
            return 0;
        }
    }


}
