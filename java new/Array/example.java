class Simple{}
interface My{}

 class Test {
     public static void main(String args[]) throws ClassNotFoundException {
         Class c = Class.forName("Simple");
         System.out.println(c.isInterface());

         Class c2 = Class.forName("My");
         System.out.println(c2.isInterface());
     }
 }
