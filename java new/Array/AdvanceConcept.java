import java.util.Arrays;

 class ArrayAdvancedExample {
    public static void main(String[] args) {

//        Enhanced for loop to iterate over an array.
//        Array initialization with values.
//        Array copy using both System.arraycopy() and clone() methods.
//                Creating and working with arrays of objects.
//        Varargs usage with arrays.
//        Creation and accessing of multi-dimensional arrays.


        // Enhanced for loop
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }

        // Array initialization with values
        int[] otherNumbers = new int[]{60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(otherNumbers));

        // Array copy
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray1 = new int[sourceArray.length];
        int[] destinationArray2 = sourceArray.clone();
        System.arraycopy(sourceArray, 0, destinationArray1, 0, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray1));
        System.out.println(Arrays.toString(destinationArray2));

        // Arrays of objects
        class Person {
            private String name;

            public Person(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        // Varargs with arrays
        printNumbers(10, 20, 30, 40, 50);

        // Multi-dimensional arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int element = matrix[0][2]; // Accessing an element (row 0, column 2)
        System.out.println(element);
        int element1 = matrix[2][2]; // Accessing an element (row 2, column 2)
        System.out.println(element1);
    }

    static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
