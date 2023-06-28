class Calc{
//    this is super class
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}


class AdvanceCalc extends Calc{
//    this is sub class
//    extends is IS-A method
//    this is single inheritance

    public double divide(double n1, double n2){
        return n1/n2;

    }
    public double multiply(double n1, double n2){
        return n1*n2;
    }
}

class AdvCalc extends AdvanceCalc{

//    this is multi level inheritance
//    ie Calc is inherited in AdvanceCalc and it is inheritance in AdvCalc

    public void show(){
        System.out.println("this is The third class");
    }

}
//Multiple inheritance is not supported in java

public class Inheritance {
    public static void main(String[] args) {
      Calc obj =new Calc();
      int r1=obj.add(12,13);
      int r2=obj.sub(1233,3212);
        System.out.println(r1);
        System.out.println(r2);

        AdvanceCalc obj1 = new AdvanceCalc();
        int add = obj1.add(123,435);
        int sub = obj1.sub(77373,3526);
        double div  =  obj1.divide(12,43);
        double mul = obj1.multiply(28.776,34.88);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);

        AdvCalc advCalc = new AdvCalc();
        advCalc.add(12,32);
        advCalc.divide(34,56);
        advCalc.show();


    }
}
