import java.util.Arrays;

 class ArrayExample {
    public static void main(String[] args) {
        // Declaration and creation of an array
        int[] numbers = new int[5];

        // Initializing array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int[] index100 = new int[100];

        for(int i=0 ; i<=99;i++){
            index100[i] = i+1;
            if(index100[50] ==51){
                index100[50] =100;
            }
        }
        System.out.println(index100[50]);




        for (int number :numbers){
            if(number == 30){
                System.out.println(true);
            }
        }

        // Accessing array elements
        int firstElement = numbers[0]; // Retrieves the value 10

        int[] rollno = new int[8];

        rollno[0] = 32525;
        rollno[1] = 32525;
        rollno[2] = 32525;
        rollno[3] = 32525;
        rollno[4] = 1;
        rollno[5] = 32525;
        rollno[6] = 32525;
        rollno[7] = 325767625;



        System.out.println(rollno[7]);
        rollno[7] =123;
        System.out.println(rollno[6]);

        String data = String.valueOf(rollno[6]);
        System.out.println(data.length());

        System.out.println( Integer.valueOf(data));

        System.out.println(rollno[6]);
        System.out.println(Arrays.asList(rollno).contains(1));

       for (int i=0 ; i<rollno.length;i++){
           if(rollno[i] == 30000){
               System.out.println("thankyou " + true);
           }else {
               System.out.println(false);
           }
       }



        // Modifying array elements
        numbers[1] = 25; // Changes the value at index 1 to 25

        // Array length
        int length = numbers.length; // Retrieves the length of the array, which is 5

        // Iterating over an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Arrays class methods
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length); // Creates a copy of the array
        System.out.println("gdsjgjsdbjhsdb" + numbersCopy[0]);

        boolean contains30 = Arrays.asList(numbers).contains(30);
        System.out.println("Bjajsbjdsiasihikn" + contains30);

        // Checks if the array contains a specific value

        Arrays.sort(numbers); // Sorts the array in ascending order

        int index = Arrays.binarySearch(numbers, 40); // Searches for a value in the sorted array and returns its index

        // Multi-dimensional arrays
        int[][] matrix = new int[4][4];
        matrix[0][0] = 9;
        matrix[0][1] = 8;
        matrix[0][2] = 7;
        matrix[0][3] = 6;
        matrix[1][0] = 9;
        matrix[1][1] = 8;
        matrix[1][2] = 7;
        matrix[1][3] = 6;
        matrix[2][0] = 9;
        matrix[2][1] = 8;
        matrix[2][2] = 7;
        matrix[2][3] = 6;
        matrix[3][0] = 9;
        matrix[3][1] = 8;
        matrix[3][2] = 7;
        matrix[3][3] = 6;

        // Printing a multi-dimensional array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


//        Declaration, creation, and initialization of an array.
//        Accessing and modifying array elements.
//                Retrieving the length of an array.
//                Iterating over an array using a for loop.
//                Using the Arrays class methods:
//        copyOf() method to create a copy of an array.
//        asList() method to convert an array into a List and check if it contains a specific value.
//                sort() method to sort the array.
//                binarySearch() method to search for a value in a sorted array and return its index.
//                Working with multi-dimensional arrays:
//        Declaration, creation, and initialization of a 2D array.
//                Printing the contents of a 2D array.
    }
}
