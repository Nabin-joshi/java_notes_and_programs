package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.Class.forName;

class Privatee{
    private Privatee()
    {
        System.out.println("I am a private constructor");
    }
    private static void dis(){
        System.out.println("Display");
    }
};

class  Reflection{
    public static void main(String[] args) throws Exception {
//        Private obj = new Private();
        //load dynamically class
        Class<?> c = Class.forName("Reflection.Privatee");
        Constructor[] declaredConstructor = c.getDeclaredConstructors();
        for(Constructor<?> constructor:declaredConstructor){
            System.out.println(constructor.getName());
            constructor.setAccessible(true);
            Privatee obj = (Privatee)constructor.newInstance();
        }


        Method method = Privatee.class.getDeclaredMethod("dis");
        method.setAccessible(true);
        method.invoke(null);

        Constructor obj = Privatee.class.getConstructor(Privatee.class);
        obj.setAccessible(true);
        Privatee p = (Privatee) obj.newInstance();

    }
}