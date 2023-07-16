package Reflection;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
    private String name;
    private int roll;

    private Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }

    private void S_details(){
        System.out.println("Name: "+name+" Roll: "+roll);
    }

    private void s_name(){
        System.out.println("Name: "+name);
    }
};

class Reflection2{
    public static void main(String[] args) throws Exception {
        // Get the class object for Person
        Class<?> StudentObj1 = Student.class;

        // Create an instance of Person using the constructor
        Constructor<?> constructor = StudentObj1.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Object studentObj2 = constructor.newInstance("Nischal Khanal",200120);

        //Changing field value
        Field field = StudentObj1.getDeclaredField("name");
        field.setAccessible(true);
        //change the value of private variable
        field.set(studentObj2,"Hunter");

        //Accessing private method
        Method method = Student.class.getDeclaredMethod("S_details");
        method.setAccessible(true);
        method.invoke(studentObj2);



        Field f = StudentObj1.getDeclaredField("name");
        f.setAccessible(true);
        f.set(studentObj2,"Abhi");

        /*
            Questions:
                        How to change the field values without constructor

         */

        Method m = Student.class.getDeclaredMethod("s_name");
        m.setAccessible(true);
        m.invoke(studentObj2);

    }
}