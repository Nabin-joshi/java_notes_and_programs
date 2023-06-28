@java.lang.FunctionalInterface
interface FunI{
     void show(int a);

}

@java.lang.FunctionalInterface
interface newfunc{
     int config(int b,int c);
}

//class Funclass implements FunI{
//    @Override
//    public void show() {
//        System.out.println("Hello");
//    }
//}


public class FunctionalInterface {
    public static void main(String[] args) {
//        functional interface is the interface with only one method
        //lambda expression will only works with functional interface
//        FunI funI = new FunI() {
//            @Override
//            public void show() {
//                System.out.println("Hello");
//            }
//        };
//
//        funI.show();

        //this only validate with functional interface
//        anonymous class ma ni use garna milxa
        //lambda expression is used to reduce the code
        //this is more of the arrow functions
        //lambda expression will also not create a another class file hence useful
        FunI funI = (a) -> {System.out.println("hello"+a);};

        funI.show(40);

//        java 8 feature is lambda expression

        newfunc newfun = ( b, c) ->  b+c;




        //or we can do
//        newfunc fuc = (b,c) ->{
//            return b+c;
//        };
        System.out.println(newfun.config(40,30));
    }
}
