package File;


import java.io.File;
import java.io.IOException;




public class Rename extends IOException {
    public static void main(String[] args) throws IOException{
        File file = new File("/home/hunter420/Desktop/Java/Lab/src/File/file.txt");

        File newFile = new File("/home/hunter420/Desktop/Java/Lab/src/File/text.txt");


           boolean status = false;
           if (file.exists()) {
               status = file.renameTo(newFile);
           } else {
               System.out.println("File not found");

           }
           if (status){
               System.out.println("File write sucessfully");

           }
       }


    }


