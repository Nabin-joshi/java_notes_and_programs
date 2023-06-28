import java.util.*;

public class widening_typeCasting_overflow {
    public static void main(String[] args) {
//        Widening
      int a= 10;
      float f= a;
        System.out.println(a);
        System.out.println(f);

//        Narrowing(Typecasting)
        int b=20;
        float fl= (float) (b *10.5);
        float F = 1.5F;
        int c= (int) F;
        System.out.print(c);
        System.out.println(fl);

//        Overflow
        int d=150;
        byte  e = (byte) d;
        System.out.println(d);
        System.out.println(e);

//      Adding  Lower Type
        byte g=10;
        byte h=  20;
        byte sum= (byte) (g+h);
        System.out.println(sum);

      byte j=120;
      int k=20;
//      implicit conversion
      k=j;
      System.out.println(k);
//      explicit conversion
      j=(byte)k;
      System.out.println(j);

      int l=10;
      int y=20;

        System.out.println(++l);

        String str = "raar", nstr="";
        char ch;

        for(int i=0;i<str.length();i++){
          ch=str.charAt(i);
          nstr =ch+nstr;
        }
      System.out.println(nstr);
        if(str.equals(nstr)){
          System.out.println("Plaindrome");
        }
    }
}
