import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

 class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get the class object for Person
        Class<?> personClass = Person.class;

        // Create an instance of Person using the constructor
        Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
        Object personObj = constructor.newInstance("Joshi", 25);

        // Access and modify private fields
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(personObj, "Nabin");

        // Invoke the sayHello method dynamically
        Method sayHelloMethod = personClass.getDeclaredMethod("sayHello");
        sayHelloMethod.setAccessible(true);
        sayHelloMethod.invoke(personObj);
    }
}
